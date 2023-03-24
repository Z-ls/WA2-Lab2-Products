package it.polito.wa2.server.profiles

import org.springframework.stereotype.Service

@Service
class ProfileServiceImp(private val profileRepository: ProfileRepository) :
    ProfileService {

    override fun getProfile(email: String): ProfileDTO? {
        return profileRepository.findAll().find { it.email == email }?.toDTO()
    }

    override fun createProfile(profile: Profile): Long? {
        profileRepository.save(profile).toDTO()
        return profile.id
    }

    override fun updateProfile(email: String, profile: Profile): Long? {
        val profileRep = profileRepository.findAll()
        val profileToUpdate = profileRep.find { it.email == email }
        profile.email = email
        profileToUpdate?.let {
            profile.id = it.id
            profileRepository.save(profile)
        }
        return profileToUpdate?.id
    }
}