package com.xiyan.shiro.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;

public class LoginLogoutTest {
	@Test
	public void testShiro() {
		// 1����ȡSecurityManager�������˴�ʹ��Ini�����ļ���ʼ��SecurityManager
		Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
		// 2���õ�SecurityManagerʵ�����󶨸�SecurityUtils
		org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);
		// 3���õ�Subject�������û���/���������֤Token�����û����/ƾ֤��
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
		try {
			// 4����¼���������֤
			subject.login(token);
		} catch (AuthenticationException e) {
			// 5�������֤ʧ��
			System.out.println("�����֤ʧ��");
		}
		Assert.assertEquals(true, subject.isAuthenticated()); // �����û��Ѿ���¼
		// 6���˳�
		subject.logout();
	}
	@Test
	public void testShiroRealm() {
		// 1����ȡSecurityManager�������˴�ʹ��Ini�����ļ���ʼ��SecurityManager
		Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-realm.ini");
		// 2���õ�SecurityManagerʵ�����󶨸�SecurityUtils
		org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);
		// 3���õ�Subject�������û���/���������֤Token�����û����/ƾ֤��
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
		try {
			// 4����¼���������֤
			subject.login(token);
		} catch (AuthenticationException e) {
			// 5�������֤ʧ��
			System.out.println("�����֤ʧ��");
		}
		Assert.assertEquals(true, subject.isAuthenticated()); // �����û��Ѿ���¼
		// 6���˳�
		subject.logout();
	}
	@Test
	public void testShiroRealms() {
		// 1����ȡSecurityManager�������˴�ʹ��Ini�����ļ���ʼ��SecurityManager
		Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-realms.ini");
		// 2���õ�SecurityManagerʵ�����󶨸�SecurityUtils
		org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);
		// 3���õ�Subject�������û���/���������֤Token�����û����/ƾ֤��
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
		try {
			// 4����¼���������֤
			subject.login(token);
		} catch (AuthenticationException e) {
			// 5�������֤ʧ��
			System.out.println("�����֤ʧ��");
		}
		Assert.assertEquals(true, subject.isAuthenticated()); // �����û��Ѿ���¼
		// 6���˳�
		subject.logout();
	}
}
