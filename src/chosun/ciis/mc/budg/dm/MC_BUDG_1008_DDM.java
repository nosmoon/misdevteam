/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_1008_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String jobtag;
	public String budg_cd;
	public String mang_item_cd;

	public MC_BUDG_1008_DDM(){}
	public MC_BUDG_1008_DDM(String cmpy_cd, String jobtag, String budg_cd, String mang_item_cd){
		this.cmpy_cd = cmpy_cd;
		this.jobtag = jobtag;
		this.budg_cd = budg_cd;
		this.mang_item_cd = mang_item_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setJobtag(String jobtag){
		this.jobtag = jobtag;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setMang_item_cd(String mang_item_cd){
		this.mang_item_cd = mang_item_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getJobtag(){
		return this.jobtag;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getMang_item_cd(){
		return this.mang_item_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_1008_D(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_1008_DDM dm = (MC_BUDG_1008_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.jobtag);
		cstmt.setString(5, dm.budg_cd);
		cstmt.setString(6, dm.mang_item_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_1008_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("jobtag = [" + getJobtag() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("mang_item_cd = [" + getMang_item_cd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String jobtag = req.getParameter("jobtag");
if( jobtag == null){
	System.out.println(this.toString+" : jobtag is null" );
}else{
	System.out.println(this.toString+" : jobtag is "+jobtag );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String mang_item_cd = req.getParameter("mang_item_cd");
if( mang_item_cd == null){
	System.out.println(this.toString+" : mang_item_cd is null" );
}else{
	System.out.println(this.toString+" : mang_item_cd is "+mang_item_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String jobtag = Util.checkString(req.getParameter("jobtag"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String mang_item_cd = Util.checkString(req.getParameter("mang_item_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String jobtag = Util.Uni2Ksc(Util.checkString(req.getParameter("jobtag")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String mang_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_item_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setJobtag(jobtag);
dm.setBudg_cd(budg_cd);
dm.setMang_item_cd(mang_item_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 14 11:51:43 KST 2009 */