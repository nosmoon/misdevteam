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


package chosun.ciis.pr.prtexec.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtexec.ds.*;
import chosun.ciis.pr.prtexec.rec.*;

/**
 * 
 */


public class PR_PRTEXEC_2007_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String issu_dt;
	public String medi_cd;
	public String sect_cd;

	public PR_PRTEXEC_2007_ADM(){}
	public PR_PRTEXEC_2007_ADM(String cmpy_cd, String issu_dt, String medi_cd, String sect_cd){
		this.cmpy_cd = cmpy_cd;
		this.issu_dt = issu_dt;
		this.medi_cd = medi_cd;
		this.sect_cd = sect_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PRTEXEC_2007_A(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PRTEXEC_2007_ADM dm = (PR_PRTEXEC_2007_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.issu_dt);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.sect_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtexec.ds.PR_PRTEXEC_2007_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
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
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setIssu_dt(issu_dt);
dm.setMedi_cd(medi_cd);
dm.setSect_cd(sect_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jun 30 18:41:41 KST 2009 */