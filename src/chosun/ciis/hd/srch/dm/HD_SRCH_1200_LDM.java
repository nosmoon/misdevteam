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


package chosun.ciis.hd.srch.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.ds.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_1200_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String emp_no;
	public String cmpy_cd;
	public String search_ck;
	public String lvcmpy_ck;

	public HD_SRCH_1200_LDM(){}
	public HD_SRCH_1200_LDM(String emp_no, String cmpy_cd, String search_ck, String lvcmpy_ck){
		this.emp_no = emp_no;
		this.cmpy_cd = cmpy_cd;
		this.search_ck = search_ck;
		this.lvcmpy_ck = lvcmpy_ck;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSearch_ck(String search_ck){
		this.search_ck = search_ck;
	}

	public void setLvcmpy_ck(String lvcmpy_ck){
		this.lvcmpy_ck = lvcmpy_ck;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSearch_ck(){
		return this.search_ck;
	}

	public String getLvcmpy_ck(){
		return this.lvcmpy_ck;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SRCH_1200_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SRCH_1200_LDM dm = (HD_SRCH_1200_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.emp_no);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.search_ck);
		cstmt.setString(6, dm.lvcmpy_ck);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.srch.ds.HD_SRCH_1200_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("search_ck = [" + getSearch_ck() + "]");
		System.out.println("lvcmpy_ck = [" + getLvcmpy_ck() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String search_ck = req.getParameter("search_ck");
if( search_ck == null){
	System.out.println(this.toString+" : search_ck is null" );
}else{
	System.out.println(this.toString+" : search_ck is "+search_ck );
}
String lvcmpy_ck = req.getParameter("lvcmpy_ck");
if( lvcmpy_ck == null){
	System.out.println(this.toString+" : lvcmpy_ck is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_ck is "+lvcmpy_ck );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String emp_no = Util.checkString(req.getParameter("emp_no"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String search_ck = Util.checkString(req.getParameter("search_ck"));
String lvcmpy_ck = Util.checkString(req.getParameter("lvcmpy_ck"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String search_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("search_ck")));
String lvcmpy_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_ck")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setEmp_no(emp_no);
dm.setCmpy_cd(cmpy_cd);
dm.setSearch_ck(search_ck);
dm.setLvcmpy_ck(lvcmpy_ck);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Apr 06 20:20:30 KST 2009 */