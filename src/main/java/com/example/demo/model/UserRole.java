package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(	name = "user_roles")
@IdClass(UserRole.UserRoleId.class)
public class UserRole {

    public static class UserRoleId implements Serializable{
        @Id
        @Column(name="user_id")
        private Long userId;

        @Id
        @Column(name="role_id")
        private Long roleId;

        public UserRoleId() {}

        public UserRoleId(Long userId, Long roleId) {
            this.userId = userId;
            this.roleId = roleId;
        }

        public Long getUserId() {
            return userId;
        }

        public void setUserId(Long userId) {
            this.userId = userId;
        }

        public Long getRoleId() {
            return roleId;
        }

        public void setRoleId(Long roleId) {
            this.roleId = roleId;
        }
    }

    @Id
    @Column(name="user_id")
    private Long userId;

    @Id
    @Column(name="role_id", insertable = false, updatable = false)
    private Long roleId;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = true, insertable = false, updatable = false)
    private User user;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "role_id", referencedColumnName = "id", nullable = true, insertable = false, updatable = false)
    private Role role;

    public UserRole(){}

    public UserRole(Long userId, Long roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    public UserRole(Long userId, Long roleId, User user, Role role) {
        this.userId = userId;
        this.roleId = roleId;
        this.user = user;
        this.role = role;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
