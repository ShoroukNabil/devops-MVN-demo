package com.devops.devops.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserListModel {

    List<UserModel> userModelList = new ArrayList<>();
}
