
    package com.example.User_Login_System.Dto;

    import jakarta.validation.constraints.Email;
    import jakarta.validation.constraints.NotEmpty;
    import jakarta.validation.constraints.Size;

    public class UserDto {

        @NotEmpty private String name;
        @Email private String email;
        @Size(min=6) private String password;
        private String conformpassword;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getConformpassword() {
            return conformpassword;
        }

        public void setConformpassword(String conformpassword) {
            this.conformpassword = conformpassword;
        }


    }
