/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.nkn.stateless.bean;

import javax.ejb.Remote;

/**
 *
 * @author mkumar1
 */
@Remote
public interface ServicesBeanRemote {

    public String getServiceDetails(String serviceName);

}
