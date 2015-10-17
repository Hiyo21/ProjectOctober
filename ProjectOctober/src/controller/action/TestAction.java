package controller.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import model.dao.TestDAO;
import model.vo.Component;
import model.vo.Test;

public class TestAction extends ActionSupport{
	Component compo;
	List<Component> compoList;
	TestDAO testDAO;

	public String insertComponent(){
		System.out.println("============check Action :: insertComponet()");
		
		System.out.println(test);
		
		int result = testDAO.insertComponent(test);
		
		if(result != 1) {
			return ERROR;
		}
		
		return SUCCESS;
	}
	
	public String receiveComponentList(){
		System.out.println("============check Action :: getComponentList()");
		testDAO = new TestDAO();
		
		testList = testDAO.getComponentList();
		
		if(testList == null) {
			return ERROR;
		}
		
		System.out.println("============check Action :: componentList ::" + testList);
		
		return SUCCESS;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("check Action Execute");
		return SUCCESS;
	}

	/////////////////////// GET & SET /////////////////////

	public List<Test> getTestList() {
		return testList;
	}

	public void setTestList(List<Test> testList) {
		this.testList = testList;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

}
