/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2531_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_cd;
	public String mang_clsf;
	public String media_cd;
	public String event_cd;
	public String fisc_yymm;
	public String acct_cd_fr;
	public String acct_cd_to;
	public String chnl_clsf_cd;

	public FC_ACCT_2531_LDM(){}
	public FC_ACCT_2531_LDM(String cmpy_cd, String dlco_cd, String mang_clsf, String media_cd, String event_cd, String fisc_yymm, String acct_cd_fr, String acct_cd_to, String chnl_clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.dlco_cd = dlco_cd;
		this.mang_clsf = mang_clsf;
		this.media_cd = media_cd;
		this.event_cd = event_cd;
		this.fisc_yymm = fisc_yymm;
		this.acct_cd_fr = acct_cd_fr;
		this.acct_cd_to = acct_cd_to;
		this.chnl_clsf_cd = chnl_clsf_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setMang_clsf(String mang_clsf){
		this.mang_clsf = mang_clsf;
	}

	public void setMedia_cd(String media_cd){
		this.media_cd = media_cd;
	}

	public void setEvent_cd(String event_cd){
		this.event_cd = event_cd;
	}

	public void setFisc_yymm(String fisc_yymm){
		this.fisc_yymm = fisc_yymm;
	}

	public void setAcct_cd_fr(String acct_cd_fr){
		this.acct_cd_fr = acct_cd_fr;
	}

	public void setAcct_cd_to(String acct_cd_to){
		this.acct_cd_to = acct_cd_to;
	}

	public void setChnl_clsf_cd(String chnl_clsf_cd){
		this.chnl_clsf_cd = chnl_clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getMang_clsf(){
		return this.mang_clsf;
	}

	public String getMedia_cd(){
		return this.media_cd;
	}

	public String getEvent_cd(){
		return this.event_cd;
	}

	public String getFisc_yymm(){
		return this.fisc_yymm;
	}

	public String getAcct_cd_fr(){
		return this.acct_cd_fr;
	}

	public String getAcct_cd_to(){
		return this.acct_cd_to;
	}

	public String getChnl_clsf_cd(){
		return this.chnl_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2531_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2531_LDM dm = (FC_ACCT_2531_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dlco_cd);
		cstmt.setString(5, dm.mang_clsf);
		cstmt.setString(6, dm.media_cd);
		cstmt.setString(7, dm.event_cd);
		cstmt.setString(8, dm.fisc_yymm);
		cstmt.setString(9, dm.acct_cd_fr);
		cstmt.setString(10, dm.acct_cd_to);
		cstmt.setString(11, dm.chnl_clsf_cd);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2531_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("mang_clsf = [" + getMang_clsf() + "]");
		System.out.println("media_cd = [" + getMedia_cd() + "]");
		System.out.println("event_cd = [" + getEvent_cd() + "]");
		System.out.println("fisc_yymm = [" + getFisc_yymm() + "]");
		System.out.println("acct_cd_fr = [" + getAcct_cd_fr() + "]");
		System.out.println("acct_cd_to = [" + getAcct_cd_to() + "]");
		System.out.println("chnl_clsf_cd = [" + getChnl_clsf_cd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String mang_clsf = req.getParameter("mang_clsf");
if( mang_clsf == null){
	System.out.println(this.toString+" : mang_clsf is null" );
}else{
	System.out.println(this.toString+" : mang_clsf is "+mang_clsf );
}
String media_cd = req.getParameter("media_cd");
if( media_cd == null){
	System.out.println(this.toString+" : media_cd is null" );
}else{
	System.out.println(this.toString+" : media_cd is "+media_cd );
}
String event_cd = req.getParameter("event_cd");
if( event_cd == null){
	System.out.println(this.toString+" : event_cd is null" );
}else{
	System.out.println(this.toString+" : event_cd is "+event_cd );
}
String fisc_yymm = req.getParameter("fisc_yymm");
if( fisc_yymm == null){
	System.out.println(this.toString+" : fisc_yymm is null" );
}else{
	System.out.println(this.toString+" : fisc_yymm is "+fisc_yymm );
}
String acct_cd_fr = req.getParameter("acct_cd_fr");
if( acct_cd_fr == null){
	System.out.println(this.toString+" : acct_cd_fr is null" );
}else{
	System.out.println(this.toString+" : acct_cd_fr is "+acct_cd_fr );
}
String acct_cd_to = req.getParameter("acct_cd_to");
if( acct_cd_to == null){
	System.out.println(this.toString+" : acct_cd_to is null" );
}else{
	System.out.println(this.toString+" : acct_cd_to is "+acct_cd_to );
}
String chnl_clsf_cd = req.getParameter("chnl_clsf_cd");
if( chnl_clsf_cd == null){
	System.out.println(this.toString+" : chnl_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : chnl_clsf_cd is "+chnl_clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String mang_clsf = Util.checkString(req.getParameter("mang_clsf"));
String media_cd = Util.checkString(req.getParameter("media_cd"));
String event_cd = Util.checkString(req.getParameter("event_cd"));
String fisc_yymm = Util.checkString(req.getParameter("fisc_yymm"));
String acct_cd_fr = Util.checkString(req.getParameter("acct_cd_fr"));
String acct_cd_to = Util.checkString(req.getParameter("acct_cd_to"));
String chnl_clsf_cd = Util.checkString(req.getParameter("chnl_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String mang_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_clsf")));
String media_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("media_cd")));
String event_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("event_cd")));
String fisc_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_yymm")));
String acct_cd_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd_fr")));
String acct_cd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd_to")));
String chnl_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chnl_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDlco_cd(dlco_cd);
dm.setMang_clsf(mang_clsf);
dm.setMedia_cd(media_cd);
dm.setEvent_cd(event_cd);
dm.setFisc_yymm(fisc_yymm);
dm.setAcct_cd_fr(acct_cd_fr);
dm.setAcct_cd_to(acct_cd_to);
dm.setChnl_clsf_cd(chnl_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 07 10:51:37 KST 2018 */