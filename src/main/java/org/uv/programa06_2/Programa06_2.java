/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.uv.programa06_2;

import org.hibernate.Session;

/**
 *
 * @author btoarriola
 */
public class Programa06_2 {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();
        session.close();
        System.out.println("Hello World!");
    }
}
