/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.mii.serversidekelompok3.model.dto.Response;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 
 * @author Fajarr
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {
    
    private String username;
    private String email;
    private List<String> authorities;
    
}