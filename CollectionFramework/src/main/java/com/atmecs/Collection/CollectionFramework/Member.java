package com.atmecs.Collection.CollectionFramework;

import java.util.Scanner;

public class Member {
	int Memberid;
	String Membername;
	int age;

	public Member(int Memberid, String Membername, int age) {
		this.Memberid = Memberid;
		this.Membername = Membername;
		this.age = age;
	}

	public int getMemberid() {
		return Memberid;
	}

	public void setMemberid(int memberid) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Are you a registered user?");

		String User = sc.nextLine();
		}
}
