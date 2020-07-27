package com.project.android.database;

import com.project.android.activitycontroller.user.ChangePasswordActivity;
import com.project.android.activitycontroller.user.UserLoginActivity;
import com.project.android.model.User;

public class AppDatabaseHelper {
    private User user;

    public AppDatabaseHelper(ChangePasswordActivity changePasswordActivity) {
    }

    public AppDatabaseHelper(UserLoginActivity userLoginActivity) {
    }

    public void updatePasswordForUser(String newPassword, long userID) {
    }

    public User getUser(String userName, String password) {
        return user;
    }

    public User getUserWithUserName(String userName) {
         return user;
    }
}
