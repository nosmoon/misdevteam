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


public class FC_ACCT_2211_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String uid;
	public String pch_acntcymdfr;
	public String pch_acntcymdto;
	public String budg_cd;
	public String kind;

	public FC_ACCT_2211_LDM(){}
	public FC_ACCT_2211_LDM(String cmpy_cd, String uid, String pch_acntcymdfr, String pch_acntcymdto, String budg_cd, String kind){
		this.cmpy_cd = cmpy_cd;
		this.uid = uid;
		this.pch_acntcymdfr = pch_acntcymdfr;
		this.pch_acntcymdto = pch_acntcymdto;
		this.budg_cd = budg_cd;
		this.kind = kind;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setPch_acntcymdfr(String pch_acntcymdfr){
		this.pch_acntcymdfr = pch_acntcymdfr;
	}

	public void setPch_acntcymdto(String pch_acntcymdto){
		this.pch_acntcymdto = pch_acntcymdto;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setKind(String kind){
		this.kind = kind;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getPch_acntcymdfr(){
		return this.pch_acntcymdfr;
	}

	public String getPch_acntcymdto(){
		return this.pch_acntcymdto;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getKind(){
		return this.kind;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2211_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2211_LDM dm = (FC_ACCT_2211_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.uid);
		cstmt.setString(5, dm.pch_acntcymdfr);
		cstmt.setString(6, dm.pch_acntcymdto);
		cstmt.setString(7, dm.budg_cd);
		cstmt.setString(8, dm.kind);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2211_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("uid = [" + getUid() + "]");
		System.out.println("pch_acntcymdfr = [" + getPch_acntcymdfr() + "]");
		System.out.println("pch_acntcymdto = [" + getPch_acntcymdto() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("kind = [" + getKind() + "]");
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
String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String pch_acntcymdfr = req.getParameter("pch_acntcymdfr");
if( pch_acntcymdfr == null){
	System.out.println(this.toString+" : pch_acntcymdfr is null" );
}else{
	System.out.println(this.toString+" : pch_acntcymdfr is "+pch_acntcymdfr );
}
String pch_acntcymdto = req.getParameter("pch_acntcymdto");
if( pch_acntcymdto == null){
	System.out.println(this.toString+" : pch_acntcymdto is null" );
}else{
	System.out.println(this.toString+" : pch_acntcymdto is "+pch_acntcymdto );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String kind = req.getParameter("kind");
if( kind == null){
	System.out.println(this.toString+" : kind is null" );
}else{
	System.out.println(this.toString+" : kind is "+kind );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String uid = Util.checkString(req.getParameter("uid"));
String pch_acntcymdfr = Util.checkString(req.getParameter("pch_acntcymdfr"));
String pch_acntcymdto = Util.checkString(req.getParameter("pch_acntcymdto"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String kind = Util.checkString(req.getParameter("kind"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String pch_acntcymdfr = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_acntcymdfr")));
String pch_acntcymdto = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_acntcymdto")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String kind = Util.Uni2Ksc(Util.checkString(req.getParameter("kind")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setUid(uid);
dm.setPch_acntcymdfr(pch_acntcymdfr);
dm.setPch_acntcymdto(pch_acntcymdto);
dm.setBudg_cd(budg_cd);
dm.setKind(kind);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 24 17:20:35 KST 2017 */