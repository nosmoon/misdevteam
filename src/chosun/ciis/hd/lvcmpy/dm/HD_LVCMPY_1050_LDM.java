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


package chosun.ciis.hd.lvcmpy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.ds.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_1050_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String lvcmpy_fr;
	public String lvcmpy_to;

	public HD_LVCMPY_1050_LDM(){}
	public HD_LVCMPY_1050_LDM(String cmpy_cd, String emp_no, String lvcmpy_fr, String lvcmpy_to){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.lvcmpy_fr = lvcmpy_fr;
		this.lvcmpy_to = lvcmpy_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setLvcmpy_fr(String lvcmpy_fr){
		this.lvcmpy_fr = lvcmpy_fr;
	}

	public void setLvcmpy_to(String lvcmpy_to){
		this.lvcmpy_to = lvcmpy_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getLvcmpy_fr(){
		return this.lvcmpy_fr;
	}

	public String getLvcmpy_to(){
		return this.lvcmpy_to;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_1050_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_1050_LDM dm = (HD_LVCMPY_1050_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.lvcmpy_fr);
		cstmt.setString(6, dm.lvcmpy_to);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_1050_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("lvcmpy_fr = " + getLvcmpy_fr());
        System.out.println("lvcmpy_to = " + getLvcmpy_to());
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String lvcmpy_fr = req.getParameter("lvcmpy_fr");
if( lvcmpy_fr == null){
	System.out.println(this.toString+" : lvcmpy_fr is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_fr is "+lvcmpy_fr );
}
String lvcmpy_to = req.getParameter("lvcmpy_to");
if( lvcmpy_to == null){
	System.out.println(this.toString+" : lvcmpy_to is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_to is "+lvcmpy_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String lvcmpy_fr = Util.checkString(req.getParameter("lvcmpy_fr"));
String lvcmpy_to = Util.checkString(req.getParameter("lvcmpy_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String lvcmpy_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_fr")));
String lvcmpy_to = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setLvcmpy_fr(lvcmpy_fr);
dm.setLvcmpy_to(lvcmpy_to);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 29 21:06:42 KST 2009 */