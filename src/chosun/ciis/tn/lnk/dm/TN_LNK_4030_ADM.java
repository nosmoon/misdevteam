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


package chosun.ciis.tn.lnk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_4030_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String umsidx;
	public String receiver;
	public String success_yn;
	public String chg_pers;

	public TN_LNK_4030_ADM(){}
	public TN_LNK_4030_ADM(String cmpy_cd, String umsidx, String receiver, String success_yn, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.umsidx = umsidx;
		this.receiver = receiver;
		this.success_yn = success_yn;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setUmsidx(String umsidx){
		this.umsidx = umsidx;
	}

	public void setReceiver(String receiver){
		this.receiver = receiver;
	}

	public void setSuccess_yn(String success_yn){
		this.success_yn = success_yn;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getUmsidx(){
		return this.umsidx;
	}

	public String getReceiver(){
		return this.receiver;
	}

	public String getSuccess_yn(){
		return this.success_yn;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_4030_A(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_4030_ADM dm = (TN_LNK_4030_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.umsidx);
		cstmt.setString(5, dm.receiver);
		cstmt.setString(6, dm.success_yn);
		cstmt.setString(7, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_4030_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("umsidx = [" + getUmsidx() + "]");
		System.out.println("receiver = [" + getReceiver() + "]");
		System.out.println("success_yn = [" + getSuccess_yn() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
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
String umsidx = req.getParameter("umsidx");
if( umsidx == null){
	System.out.println(this.toString+" : umsidx is null" );
}else{
	System.out.println(this.toString+" : umsidx is "+umsidx );
}
String receiver = req.getParameter("receiver");
if( receiver == null){
	System.out.println(this.toString+" : receiver is null" );
}else{
	System.out.println(this.toString+" : receiver is "+receiver );
}
String success_yn = req.getParameter("success_yn");
if( success_yn == null){
	System.out.println(this.toString+" : success_yn is null" );
}else{
	System.out.println(this.toString+" : success_yn is "+success_yn );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String umsidx = Util.checkString(req.getParameter("umsidx"));
String receiver = Util.checkString(req.getParameter("receiver"));
String success_yn = Util.checkString(req.getParameter("success_yn"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String umsidx = Util.Uni2Ksc(Util.checkString(req.getParameter("umsidx")));
String receiver = Util.Uni2Ksc(Util.checkString(req.getParameter("receiver")));
String success_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("success_yn")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setUmsidx(umsidx);
dm.setReceiver(receiver);
dm.setSuccess_yn(success_yn);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 05 17:33:16 KST 2016 */