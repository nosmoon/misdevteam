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


package chosun.ciis.mt.submatrout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.ds.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 * 
 */


public class MT_SUBMATROUT_1202_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String owh_dt_fr;
	public String owh_dt_to;
	public String fac_clsf;
	public String matr_cd_fr;
	public String matr_cd_to;
	public String matr_cd_clsf;
	public String owh_dept;
	public String owh_budg_cd;
	public String matr_clas;
	public String matr_cd;

	public MT_SUBMATROUT_1202_LDM(){}
	public MT_SUBMATROUT_1202_LDM(String cmpy_cd, String owh_dt_fr, String owh_dt_to, String fac_clsf, String matr_cd_fr, String matr_cd_to, String matr_cd_clsf, String owh_dept, String owh_budg_cd, String matr_clas, String matr_cd){
		this.cmpy_cd = cmpy_cd;
		this.owh_dt_fr = owh_dt_fr;
		this.owh_dt_to = owh_dt_to;
		this.fac_clsf = fac_clsf;
		this.matr_cd_fr = matr_cd_fr;
		this.matr_cd_to = matr_cd_to;
		this.matr_cd_clsf = matr_cd_clsf;
		this.owh_dept = owh_dept;
		this.owh_budg_cd = owh_budg_cd;
		this.matr_clas = matr_clas;
		this.matr_cd = matr_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOwh_dt_fr(String owh_dt_fr){
		this.owh_dt_fr = owh_dt_fr;
	}

	public void setOwh_dt_to(String owh_dt_to){
		this.owh_dt_to = owh_dt_to;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMatr_cd_fr(String matr_cd_fr){
		this.matr_cd_fr = matr_cd_fr;
	}

	public void setMatr_cd_to(String matr_cd_to){
		this.matr_cd_to = matr_cd_to;
	}

	public void setMatr_cd_clsf(String matr_cd_clsf){
		this.matr_cd_clsf = matr_cd_clsf;
	}

	public void setOwh_dept(String owh_dept){
		this.owh_dept = owh_dept;
	}

	public void setOwh_budg_cd(String owh_budg_cd){
		this.owh_budg_cd = owh_budg_cd;
	}
	
	public void setMatr_clas(String matr_clas){
		this.matr_clas = matr_clas;
	}
		
	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOwh_dt_fr(){
		return this.owh_dt_fr;
	}

	public String getOwh_dt_to(){
		return this.owh_dt_to;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMatr_cd_fr(){
		return this.matr_cd_fr;
	}

	public String getMatr_cd_to(){
		return this.matr_cd_to;
	}

	public String getMatr_cd_clsf(){
		return this.matr_cd_clsf;
	}

	public String getOwh_dept(){
		return this.owh_dept;
	}

	public String getOwh_budg_cd(){
		return this.owh_budg_cd;
	}
	
	public String getMatr_clas(){
		return this.matr_clas;
	}	

	public String getMatr_cd(){
		return this.matr_cd;
	}
	
	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATROUT_1202_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATROUT_1202_LDM dm = (MT_SUBMATROUT_1202_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.owh_dt_fr);
		cstmt.setString(5, dm.owh_dt_to);
		cstmt.setString(6, dm.fac_clsf);
		cstmt.setString(7, dm.matr_cd_fr);
		cstmt.setString(8, dm.matr_cd_to);
		cstmt.setString(9, dm.matr_cd_clsf);
		cstmt.setString(10, dm.owh_dept);
		cstmt.setString(11, dm.owh_budg_cd);
		cstmt.setString(12, dm.matr_clas);
		cstmt.setString(13, dm.matr_cd);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrout.ds.MT_SUBMATROUT_1202_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("owh_dt_fr = [" + getOwh_dt_fr() + "]");
		System.out.println("owh_dt_to = [" + getOwh_dt_to() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("matr_cd_fr = [" + getMatr_cd_fr() + "]");
		System.out.println("matr_cd_to = [" + getMatr_cd_to() + "]");
		System.out.println("matr_cd_clsf = [" + getMatr_cd_clsf() + "]");
		System.out.println("owh_dept = [" + getOwh_dept() + "]");
		System.out.println("matr_clas = [" + getMatr_clas() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
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
String owh_dt_fr = req.getParameter("owh_dt_fr");
if( owh_dt_fr == null){
	System.out.println(this.toString+" : owh_dt_fr is null" );
}else{
	System.out.println(this.toString+" : owh_dt_fr is "+owh_dt_fr );
}
String owh_dt_to = req.getParameter("owh_dt_to");
if( owh_dt_to == null){
	System.out.println(this.toString+" : owh_dt_to is null" );
}else{
	System.out.println(this.toString+" : owh_dt_to is "+owh_dt_to );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String matr_cd_fr = req.getParameter("matr_cd_fr");
if( matr_cd_fr == null){
	System.out.println(this.toString+" : matr_cd_fr is null" );
}else{
	System.out.println(this.toString+" : matr_cd_fr is "+matr_cd_fr );
}
String matr_cd_to = req.getParameter("matr_cd_to");
if( matr_cd_to == null){
	System.out.println(this.toString+" : matr_cd_to is null" );
}else{
	System.out.println(this.toString+" : matr_cd_to is "+matr_cd_to );
}
String matr_cd_clsf = req.getParameter("matr_cd_clsf");
if( matr_cd_clsf == null){
	System.out.println(this.toString+" : matr_cd_clsf is null" );
}else{
	System.out.println(this.toString+" : matr_cd_clsf is "+matr_cd_clsf );
}
String owh_dept = req.getParameter("owh_dept");
if( owh_dept == null){
	System.out.println(this.toString+" : owh_dept is null" );
}else{
	System.out.println(this.toString+" : owh_dept is "+owh_dept );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String owh_dt_fr = Util.checkString(req.getParameter("owh_dt_fr"));
String owh_dt_to = Util.checkString(req.getParameter("owh_dt_to"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String matr_cd_fr = Util.checkString(req.getParameter("matr_cd_fr"));
String matr_cd_to = Util.checkString(req.getParameter("matr_cd_to"));
String matr_cd_clsf = Util.checkString(req.getParameter("matr_cd_clsf"));
String owh_dept = Util.checkString(req.getParameter("owh_dept"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String owh_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_dt_fr")));
String owh_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_dt_to")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String matr_cd_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd_fr")));
String matr_cd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd_to")));
String matr_cd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd_clsf")));
String owh_dept = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_dept")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setOwh_dt_fr(owh_dt_fr);
dm.setOwh_dt_to(owh_dt_to);
dm.setFac_clsf(fac_clsf);
dm.setMatr_cd_fr(matr_cd_fr);
dm.setMatr_cd_to(matr_cd_to);
dm.setMatr_cd_clsf(matr_cd_clsf);
dm.setOwh_dept(owh_dept);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 09 19:56:13 KST 2009 */