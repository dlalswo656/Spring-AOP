package com.example.alswo.dto;

import com.example.alswo.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDTO {
    private Long id;
    private String name;
    private String password;
    private String phone;

    public static UserDTO toUserDTO(UserEntity userEntity) {

        UserDTO userDTO = new UserDTO();
        userDTO.setId(userEntity.getId());
        userDTO.setName(userEntity.getName());
        userDTO.setPassword(userEntity.getPassword());
        userDTO.setPhone(userEntity.getPhone());

        return userDTO;
    }
}
