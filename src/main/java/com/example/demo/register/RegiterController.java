package com.example.demo.register;


import com.example.demo.dao.RoleDAO;
import com.example.demo.dao.UserDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.print.DocFlavor;


public class RegiterController {

        @FXML
        private Button regiterBtn;

        @FXML
        private TextField passText;

        @FXML
        private TextField pass1Text;

        @FXML
        private TextField idText;

        @FXML
        void regiter(ActionEvent event) {
                String tel = this.idText.getText();
                String password = this.passText.getText();
                UserDAO userDAO = new UserDAO();
               // userDAO.addRole(tel,password,null,)

        }
}


