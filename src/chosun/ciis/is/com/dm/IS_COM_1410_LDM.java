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


package chosun.ciis.is.com.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.com.ds.*;
import chosun.ciis.is.com.rec.*;

/**
 * 
 */


public class IS_COM_1410_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_clsf_cd_seq;
	public String chrg_pers_nm;
	public String chrg_job_clsf;
	public String email;

	public IS_COM_1410_LDM(){}
	public IS_COM_1410_LDM(String cmpy_cd, String dlco_clsf_cd_seq, String chrg_pers_nm, String chrg_job_clsf, String email){
		this.cmpy_cd = cmpy_cd;
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
		this.chrg_pers_nm = chrg_pers_nm;
		this.chrg_job_clsf = chrg_job_clsf;
		this.email = email;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setChrg_job_clsf(String chrg_job_clsf){
		this.chrg_job_clsf = chrg_job_clsf;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getChrg_job_clsf(){
		return this.chrg_job_clsf;
	}

	public String getEmail(){
		return this.email;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_COM_1410_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_COM_1410_LDM dm = (IS_COM_1410_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dlco_clsf_cd_seq);
		cstmt.setString(5, dm.chrg_pers_nm);
		cstmt.setString(6, dm.chrg_job_clsf);
		cstmt.setString(7, dm.email);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.com.ds.IS_COM_1410_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_clsf_cd_seq = [" + getDlco_clsf_cd_seq() + "]");
		System.out.println("chrg_pers_nm = [" + getChrg_pers_nm() + "]");
		System.out.println("chrg_job_clsf = [" + getChrg_job_clsf() + "]");
		System.out.println("email = [" + getEmail() + "]");
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
String dlco_clsf_cd_seq = req.getParameter("dlco_clsf_cd_seq");
if( dlco_clsf_cd_seq == null){
	System.out.println(this.toString+" : dlco_clsf_cd_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd_seq is "+dlco_clsf_cd_seq );
}
String chrg_pers_nm = req.getParameter("chrg_pers_nm");
if( chrg_pers_nm == null){
	System.out.println(this.toString+" : chrg_pers_nm is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_nm is "+chrg_pers_nm );
}
String chrg_job_clsf = req.getParameter("chrg_job_clsf");
if( chrg_job_clsf == null){
	System.out.println(this.toString+" : chrg_job_clsf is null" );
}else{
	System.out.println(this.toString+" : chrg_job_clsf is "+chrg_job_clsf );
}
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
String chrg_pers_nm = Util.checkString(req.getParameter("chrg_pers_nm"));
String chrg_job_clsf = Util.checkString(req.getParameter("chrg_job_clsf"));
String email = Util.checkString(req.getParameter("email"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd_seq")));
String chrg_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_nm")));
String chrg_job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_job_clsf")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setDlco_clsf_cd_seq(dlco_clsf_cd_seq);
dm.setChrg_pers_nm(chrg_pers_nm);
dm.setChrg_job_clsf(chrg_job_clsf);
dm.setEmail(email);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed May 09 11:26:56 KST 2012 */