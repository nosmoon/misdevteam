/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.evlu.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.ds.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_3101_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evlu_yy;
	public String tms_clsf;
	public String evlu_pers_emp_no_1tms;

	public HD_EVLU_3101_LDM(){}
	public HD_EVLU_3101_LDM(String cmpy_cd, String evlu_yy, String tms_clsf, String evlu_pers_emp_no_1tms){
		this.cmpy_cd = cmpy_cd;
		this.evlu_yy = evlu_yy;
		this.tms_clsf = tms_clsf;
		this.evlu_pers_emp_no_1tms = evlu_pers_emp_no_1tms;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvlu_yy(String evlu_yy){
		this.evlu_yy = evlu_yy;
	}

	public void setTms_clsf(String tms_clsf){
		this.tms_clsf = tms_clsf;
	}

	public void setEvlu_pers_emp_no_1tms(String evlu_pers_emp_no_1tms){
		this.evlu_pers_emp_no_1tms = evlu_pers_emp_no_1tms;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvlu_yy(){
		return this.evlu_yy;
	}

	public String getTms_clsf(){
		return this.tms_clsf;
	}

	public String getEvlu_pers_emp_no_1tms(){
		return this.evlu_pers_emp_no_1tms;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EVLU_3101_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EVLU_3101_LDM dm = (HD_EVLU_3101_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evlu_yy);
		cstmt.setString(5, dm.tms_clsf);
		cstmt.setString(6, dm.evlu_pers_emp_no_1tms);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.evlu.ds.HD_EVLU_3101_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("evlu_yy = [" + getEvlu_yy() + "]");
		System.out.println("tms_clsf = [" + getTms_clsf() + "]");
		System.out.println("evlu_pers_emp_no_1tms = [" + getEvlu_pers_emp_no_1tms() + "]");
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
String evlu_yy = req.getParameter("evlu_yy");
if( evlu_yy == null){
	System.out.println(this.toString+" : evlu_yy is null" );
}else{
	System.out.println(this.toString+" : evlu_yy is "+evlu_yy );
}
String tms_clsf = req.getParameter("tms_clsf");
if( tms_clsf == null){
	System.out.println(this.toString+" : tms_clsf is null" );
}else{
	System.out.println(this.toString+" : tms_clsf is "+tms_clsf );
}
String evlu_pers_emp_no_1tms = req.getParameter("evlu_pers_emp_no_1tms");
if( evlu_pers_emp_no_1tms == null){
	System.out.println(this.toString+" : evlu_pers_emp_no_1tms is null" );
}else{
	System.out.println(this.toString+" : evlu_pers_emp_no_1tms is "+evlu_pers_emp_no_1tms );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
String tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
String evlu_pers_emp_no_1tms = Util.checkString(req.getParameter("evlu_pers_emp_no_1tms"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evlu_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_yy")));
String tms_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_clsf")));
String evlu_pers_emp_no_1tms = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_pers_emp_no_1tms")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setEvlu_yy(evlu_yy);
dm.setTms_clsf(tms_clsf);
dm.setEvlu_pers_emp_no_1tms(evlu_pers_emp_no_1tms);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Sep 08 19:09:19 KST 2016 */