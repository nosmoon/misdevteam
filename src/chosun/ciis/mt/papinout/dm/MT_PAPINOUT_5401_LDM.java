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


package chosun.ciis.mt.papinout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.ds.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_5401_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String issu_dt_fr;
	public String issu_dt_to;
	public String pj_kind;
	public String hdqt_paper_use_yn;
	public String issu_gubun;

	public MT_PAPINOUT_5401_LDM(){}
	public MT_PAPINOUT_5401_LDM(String cmpy_cd, String issu_dt_fr, String issu_dt_to, String pj_kind, String hdqt_paper_use_yn, String issu_gubun){
		this.cmpy_cd = cmpy_cd;
		this.issu_dt_fr = issu_dt_fr;
		this.issu_dt_to = issu_dt_to;
		this.pj_kind = pj_kind;
		this.hdqt_paper_use_yn = hdqt_paper_use_yn;
		this.issu_gubun = issu_gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_dt_fr(String issu_dt_fr){
		this.issu_dt_fr = issu_dt_fr;
	}

	public void setIssu_dt_to(String issu_dt_to){
		this.issu_dt_to = issu_dt_to;
	}

	public void setPj_kind(String pj_kind){
		this.pj_kind = pj_kind;
	}

	public void setHdqt_paper_use_yn(String hdqt_paper_use_yn){
		this.hdqt_paper_use_yn = hdqt_paper_use_yn;
	}

	public void setIssu_gubun(String issu_gubun){
		this.issu_gubun = issu_gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIssu_dt_fr(){
		return this.issu_dt_fr;
	}

	public String getIssu_dt_to(){
		return this.issu_dt_to;
	}

	public String getPj_kind(){
		return this.pj_kind;
	}

	public String getHdqt_paper_use_yn(){
		return this.hdqt_paper_use_yn;
	}

	public String getIssu_gubun(){
		return this.issu_gubun;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_5401_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_5401_LDM dm = (MT_PAPINOUT_5401_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.issu_dt_fr);
		cstmt.setString(5, dm.issu_dt_to);
		cstmt.setString(6, dm.pj_kind);
		cstmt.setString(7, dm.hdqt_paper_use_yn);
		cstmt.setString(8, dm.issu_gubun);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_5401_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("issu_dt_fr = [" + getIssu_dt_fr() + "]");
		System.out.println("issu_dt_to = [" + getIssu_dt_to() + "]");
		System.out.println("pj_kind = [" + getPj_kind() + "]");
		System.out.println("hdqt_paper_use_yn = [" + getHdqt_paper_use_yn() + "]");
		System.out.println("issu_gubun = [" + getIssu_gubun() + "]");
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
String issu_dt_fr = req.getParameter("issu_dt_fr");
if( issu_dt_fr == null){
	System.out.println(this.toString+" : issu_dt_fr is null" );
}else{
	System.out.println(this.toString+" : issu_dt_fr is "+issu_dt_fr );
}
String issu_dt_to = req.getParameter("issu_dt_to");
if( issu_dt_to == null){
	System.out.println(this.toString+" : issu_dt_to is null" );
}else{
	System.out.println(this.toString+" : issu_dt_to is "+issu_dt_to );
}
String pj_kind = req.getParameter("pj_kind");
if( pj_kind == null){
	System.out.println(this.toString+" : pj_kind is null" );
}else{
	System.out.println(this.toString+" : pj_kind is "+pj_kind );
}
String hdqt_paper_use_yn = req.getParameter("hdqt_paper_use_yn");
if( hdqt_paper_use_yn == null){
	System.out.println(this.toString+" : hdqt_paper_use_yn is null" );
}else{
	System.out.println(this.toString+" : hdqt_paper_use_yn is "+hdqt_paper_use_yn );
}
String issu_gubun = req.getParameter("issu_gubun");
if( issu_gubun == null){
	System.out.println(this.toString+" : issu_gubun is null" );
}else{
	System.out.println(this.toString+" : issu_gubun is "+issu_gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String issu_dt_fr = Util.checkString(req.getParameter("issu_dt_fr"));
String issu_dt_to = Util.checkString(req.getParameter("issu_dt_to"));
String pj_kind = Util.checkString(req.getParameter("pj_kind"));
String hdqt_paper_use_yn = Util.checkString(req.getParameter("hdqt_paper_use_yn"));
String issu_gubun = Util.checkString(req.getParameter("issu_gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String issu_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt_fr")));
String issu_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt_to")));
String pj_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("pj_kind")));
String hdqt_paper_use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("hdqt_paper_use_yn")));
String issu_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setIssu_dt_fr(issu_dt_fr);
dm.setIssu_dt_to(issu_dt_to);
dm.setPj_kind(pj_kind);
dm.setHdqt_paper_use_yn(hdqt_paper_use_yn);
dm.setIssu_gubun(issu_gubun);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Aug 20 21:35:14 KST 2009 */