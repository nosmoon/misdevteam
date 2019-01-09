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


package chosun.ciis.ad.pub.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3220_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String pubc_dt;
	public String edt_yn;
	public String pubc_yn;
	public String advt_yn;
	public String low_uprc;
	public String sect_cd;
	public String sect_seq;

	public AD_PUB_3220_LDM(){}
	public AD_PUB_3220_LDM(String cmpy_cd, String medi_cd, String pubc_dt, String edt_yn, String pubc_yn, String advt_yn, String low_uprc, String sect_cd, String sect_seq){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.pubc_dt = pubc_dt;
		this.edt_yn = edt_yn;
		this.pubc_yn = pubc_yn;
		this.advt_yn = advt_yn;
		this.low_uprc = low_uprc;
		this.sect_cd = sect_cd;
		this.sect_seq = sect_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setEdt_yn(String edt_yn){
		this.edt_yn = edt_yn;
	}

	public void setPubc_yn(String pubc_yn){
		this.pubc_yn = pubc_yn;
	}

	public void setAdvt_yn(String advt_yn){
		this.advt_yn = advt_yn;
	}

	public void setLow_uprc(String low_uprc){
		this.low_uprc = low_uprc;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_seq(String sect_seq){
		this.sect_seq = sect_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getEdt_yn(){
		return this.edt_yn;
	}

	public String getPubc_yn(){
		return this.pubc_yn;
	}

	public String getAdvt_yn(){
		return this.advt_yn;
	}

	public String getLow_uprc(){
		return this.low_uprc;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_seq(){
		return this.sect_seq;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_3220_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_3220_LDM dm = (AD_PUB_3220_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.pubc_dt);
		cstmt.setString(6, dm.edt_yn);
		cstmt.setString(7, dm.pubc_yn);
		cstmt.setString(8, dm.advt_yn);
		cstmt.setString(9, dm.low_uprc);
		cstmt.setString(10, dm.sect_cd);
		cstmt.setString(11, dm.sect_seq);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_3220_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("pubc_dt = [" + getPubc_dt() + "]");
		System.out.println("edt_yn = [" + getEdt_yn() + "]");
		System.out.println("pubc_yn = [" + getPubc_yn() + "]");
		System.out.println("advt_yn = [" + getAdvt_yn() + "]");
		System.out.println("low_uprc = [" + getLow_uprc() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("sect_seq = [" + getSect_seq() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String pubc_dt = req.getParameter("pubc_dt");
if( pubc_dt == null){
	System.out.println(this.toString+" : pubc_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_dt is "+pubc_dt );
}
String edt_yn = req.getParameter("edt_yn");
if( edt_yn == null){
	System.out.println(this.toString+" : edt_yn is null" );
}else{
	System.out.println(this.toString+" : edt_yn is "+edt_yn );
}
String pubc_yn = req.getParameter("pubc_yn");
if( pubc_yn == null){
	System.out.println(this.toString+" : pubc_yn is null" );
}else{
	System.out.println(this.toString+" : pubc_yn is "+pubc_yn );
}
String advt_yn = req.getParameter("advt_yn");
if( advt_yn == null){
	System.out.println(this.toString+" : advt_yn is null" );
}else{
	System.out.println(this.toString+" : advt_yn is "+advt_yn );
}
String low_uprc = req.getParameter("low_uprc");
if( low_uprc == null){
	System.out.println(this.toString+" : low_uprc is null" );
}else{
	System.out.println(this.toString+" : low_uprc is "+low_uprc );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
}
String sect_seq = req.getParameter("sect_seq");
if( sect_seq == null){
	System.out.println(this.toString+" : sect_seq is null" );
}else{
	System.out.println(this.toString+" : sect_seq is "+sect_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
String edt_yn = Util.checkString(req.getParameter("edt_yn"));
String pubc_yn = Util.checkString(req.getParameter("pubc_yn"));
String advt_yn = Util.checkString(req.getParameter("advt_yn"));
String low_uprc = Util.checkString(req.getParameter("low_uprc"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String sect_seq = Util.checkString(req.getParameter("sect_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String pubc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_dt")));
String edt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("edt_yn")));
String pubc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_yn")));
String advt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_yn")));
String low_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("low_uprc")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String sect_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setPubc_dt(pubc_dt);
dm.setEdt_yn(edt_yn);
dm.setPubc_yn(pubc_yn);
dm.setAdvt_yn(advt_yn);
dm.setLow_uprc(low_uprc);
dm.setSect_cd(sect_cd);
dm.setSect_seq(sect_seq);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 31 15:55:14 KST 2014 */