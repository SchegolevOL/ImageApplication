package ru.olschegolev.imageapplication;

public class User {
    private String _name;
    private String _phone;
    private String _email;
    private int _image;

    public User(String _name, String _phone, String _email, int _image) {
        this._name = _name;
        this._phone = _phone;
        this._email = _email;
        this._image = _image;
    }

    public int getImage() {
        return _image;
    }

    public void setImage(int image) {
        this._image = image;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getPhone() {
        return _phone;
    }

    public void setPhone(String phone) {
        this._phone = phone;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        this._email = email;
    }


}
