package com.qa.Maventest;

import java.util.List;

public class Delegate {
	private String job;
	private String name;
	private int age;

	public Delegate(String name, int age, String job, List<Delegate> peeps) {
		this.setName(name);
		this.setJob(job);
		this.setAge(age);
		peeps.add(this);
	}

	public void remove(List<Delegate> peeps) {
		peeps.remove(this);
		System.gc();
	}

	public Delegate search() {
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Delegate other = (Delegate) obj;
		if (age != other.age)
			return false;
		if (job == null) {
			if (other.job != null)
				return false;
		} else if (!job.equals(other.job))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[name=" + name + ",job=" + job + ", age=" + age + "]";
	}

}
