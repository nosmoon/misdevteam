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


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_3010_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String info_clsf;

	public HD_INFO_3010_SDM(){}
	public HD_INFO_3010_SDM(String cmpy_cd, String emp_no, String info_clsf){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.info_clsf = info_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setInfo_clsf(String info_clsf){
		this.info_clsf = info_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getInfo_clsf(){
		return this.info_clsf;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_3010_S(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_3010_SDM dm = (HD_INFO_3010_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.info_clsf);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_3010_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("info_clsf = [" + getInfo_clsf() + "]");
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
String info_clsf = req.getParameter("info_clsf");
if( info_clsf == null){
	System.out.println(this.toString+" : info_clsf is null" );
}else{
	System.out.println(this.toString+" : info_clsf is "+info_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String info_clsf = Util.checkString(req.getParameter("info_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String info_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("info_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setInfo_clsf(info_clsf);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Aug 25 21:34:23 KST 2009 */