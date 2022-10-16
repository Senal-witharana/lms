package kln.iad.lms.service;

import kln.iad.lms.entity.AppUser;

import java.util.Optional;

public interface AppUserService {

    Optional<AppUser> getAppUserById(final String id);
}
