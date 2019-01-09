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


package chosun.ciis.mt.commatr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.ds.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_9101_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String aply_dt_fr;
	public String aply_dt_to;

	public MT_COMMATR_9101_LDM(){}
	public MT_COMMATR_9101_LDM(String cmpy_cd, String aply_dt_fr, String aply_dt_to){
		this.cmpy_cd = cmpy_cd;
		this.aply_dt_fr = aply_dt_fr;
		this.aply_dt_to = aply_dt_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_dt_fr(String aply_dt_fr){
		this.aply_dt_fr = aply_dt_fr;
	}

	public void setAply_dt_to(String aply_dt_to){
		this.aply_dt_to = aply_dt_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_dt_fr(){
		return this.aply_dt_fr;
	}

	public String getAply_dt_to(){
		return this.aply_dt_to;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMATR_9101_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_9101_LDM dm = (MT_COMMATR_9101_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.aply_dt_fr);
		cstmt.setString(5, dm.aply_dt_to);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_9101_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aply_dt_fr = [" + getAply_dt_fr() + "]");
		System.out.println("aply_dt_to = [" + getAply_dt_to() + "]");
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
String aply_dt_fr = req.getParameter("aply_dt_fr");
if( aply_dt_fr == null){
	System.out.println(this.toString+" : aply_dt_fr is null" );
}else{
	System.out.println(this.toString+" : aply_dt_fr is "+aply_dt_fr );
}
String aply_dt_to = req.getParameter("aply_dt_to");
if( aply_dt_to == null){
	System.out.println(this.toString+" : aply_dt_to is null" );
}else{
	System.out.println(this.toString+" : aply_dt_to is "+aply_dt_to );
}
String pj_kind = req.getParameter("pj_kind");
if( pj_kind == null){
	System.out.println(this.toString+" : pj_kind is null" );
}else{
	System.out.println(this.toString+" : pj_kind is "+pj_kind );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aply_dt_fr = Util.checkString(req.getParameter("aply_dt_fr"));
String aply_dt_to = Util.checkString(req.getParameter("aply_dt_to"));
String pj_kind = Util.checkString(req.getParameter("pj_kind"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aply_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt_fr")));
String aply_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt_to")));
String pj_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("pj_kind")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setAply_dt_fr(aply_dt_fr);
dm.setAply_dt_to(aply_dt_to);
dm.setPj_kind(pj_kind);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 11 15:11:17 KST 2009 */