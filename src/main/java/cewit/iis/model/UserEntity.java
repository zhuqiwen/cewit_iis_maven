package cewit.iis.model;

import javax.persistence.*;

/**
 * Created by zqw on 3/14/17.
 */
@Entity
@Table(name = "user", schema = "cewit_iis_maven", catalog = "")
public class UserEntity {
	private int id;
	private String nickname;
	private String firstName;
	private String lastName;
	private String password;

	@Id
	@Column(name = "id", nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "nickname", nullable = true, length = 20)
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Basic
	@Column(name = "first_name", nullable = true, length = 20)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Basic
	@Column(name = "last_name", nullable = true, length = 20)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Basic
	@Column(name = "password", nullable = true, length = 64)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		UserEntity that = (UserEntity) o;

		if (id != that.id) return false;
		if (nickname != null ? !nickname.equals(that.nickname) : that.nickname != null) return false;
		if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
		if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
		if (password != null ? !password.equals(that.password) : that.password != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
		result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
		result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
		result = 31 * result + (password != null ? password.hashCode() : 0);
		return result;
	}
}
