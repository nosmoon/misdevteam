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


package chosun.ciis.tn.dns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.dns.ds.*;
import chosun.ciis.tn.dns.rec.*;

/**
 * 
 */


public class TN_DNS_1045_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String incmg_pers;
	public String memberidx;
	public String promiseidx;
	public String stopdate;
	public String stopresn;
	public String cmsstopdate;

	public TN_DNS_1045_UDM(){}
	public TN_DNS_1045_UDM(String mode, String cmpy_cd, String incmg_pers, String memberidx, String promiseidx, String stopdate, String stopresn, String cmsstopdate){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.memberidx = memberidx;
		this.promiseidx = promiseidx;
		this.stopdate = stopdate;
		this.stopresn = stopresn;
		this.cmsstopdate = cmsstopdate;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setPromiseidx(String promiseidx){
		this.promiseidx = promiseidx;
	}

	public void setStopdate(String stopdate){
		this.stopdate = stopdate;
	}

	public void setStopresn(String stopresn){
		this.stopresn = stopresn;
	}

	public void setCmsstopdate(String cmsstopdate){
		this.cmsstopdate = cmsstopdate;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getPromiseidx(){
		return this.promiseidx;
	}

	public String getStopdate(){
		return this.stopdate;
	}

	public String getStopresn(){
		return this.stopresn;
	}

	public String getCmsstopdate(){
		return this.cmsstopdate;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_DNS_1045_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_DNS_1045_UDM dm = (TN_DNS_1045_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.memberidx);
		cstmt.setString(7, dm.promiseidx);
		cstmt.setString(8, dm.stopdate);
		cstmt.setString(9, dm.stopresn);
		cstmt.setString(10, dm.cmsstopdate);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.dns.ds.TN_DNS_1045_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("memberidx = [" + getMemberidx() + "]");
		System.out.println("promiseidx = [" + getPromiseidx() + "]");
		System.out.println("stopdate = [" + getStopdate() + "]");
		System.out.println("stopresn = [" + getStopresn() + "]");
		System.out.println("cmsstopdate = [" + getCmsstopdate() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String memberidx = req.getParameter("memberidx");
if( memberidx == null){
	System.out.println(this.toString+" : memberidx is null" );
}else{
	System.out.println(this.toString+" : memberidx is "+memberidx );
}
String promiseidx = req.getParameter("promiseidx");
if( promiseidx == null){
	System.out.println(this.toString+" : promiseidx is null" );
}else{
	System.out.println(this.toString+" : promiseidx is "+promiseidx );
}
String stopdate = req.getParameter("stopdate");
if( stopdate == null){
	System.out.println(this.toString+" : stopdate is null" );
}else{
	System.out.println(this.toString+" : stopdate is "+stopdate );
}
String stopresn = req.getParameter("stopresn");
if( stopresn == null){
	System.out.println(this.toString+" : stopresn is null" );
}else{
	System.out.println(this.toString+" : stopresn is "+stopresn );
}
String cmsstopdate = req.getParameter("cmsstopdate");
if( cmsstopdate == null){
	System.out.println(this.toString+" : cmsstopdate is null" );
}else{
	System.out.println(this.toString+" : cmsstopdate is "+cmsstopdate );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String memberidx = Util.checkString(req.getParameter("memberidx"));
String promiseidx = Util.checkString(req.getParameter("promiseidx"));
String stopdate = Util.checkString(req.getParameter("stopdate"));
String stopresn = Util.checkString(req.getParameter("stopresn"));
String cmsstopdate = Util.checkString(req.getParameter("cmsstopdate"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String memberidx = Util.Uni2Ksc(Util.checkString(req.getParameter("memberidx")));
String promiseidx = Util.Uni2Ksc(Util.checkString(req.getParameter("promiseidx")));
String stopdate = Util.Uni2Ksc(Util.checkString(req.getParameter("stopdate")));
String stopresn = Util.Uni2Ksc(Util.checkString(req.getParameter("stopresn")));
String cmsstopdate = Util.Uni2Ksc(Util.checkString(req.getParameter("cmsstopdate")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setMemberidx(memberidx);
dm.setPromiseidx(promiseidx);
dm.setStopdate(stopdate);
dm.setStopresn(stopresn);
dm.setCmsstopdate(cmsstopdate);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 09 16:21:01 KST 2016 */