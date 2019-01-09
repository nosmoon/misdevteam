/***************************************************************************************************
* 파일명 : .java
* 기능 : 정보공유-실시간공지-지국공지 수정
* 작성일자 : 2009-04-16
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * 정보공유-실시간공지-지국공지 수정
 */

public class SS_U_ANNCBODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public long seq;
	public String rmsgdept;
	public String rmsgdeptnm;
	public String rmsgarea;
	public String rmsgareanm;
	public String anncbgntm;
	public String anncendtm;
	public String annctitl;
	public String annccont;

	public SS_U_ANNCBODM(){}
	public SS_U_ANNCBODM(String uid, long seq, String rmsgdept, String rmsgdeptnm, String rmsgarea, String rmsgareanm, String anncbgntm, String anncendtm, String annctitl, String annccont){
		this.uid = uid;
		this.seq = seq;
		this.rmsgdept = rmsgdept;
		this.rmsgdeptnm = rmsgdeptnm;
		this.rmsgarea = rmsgarea;
		this.rmsgareanm = rmsgareanm;
		this.anncbgntm = anncbgntm;
		this.anncendtm = anncendtm;
		this.annctitl = annctitl;
		this.annccont = annccont;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setSeq(long seq){
		this.seq = seq;
	}

	public void setRmsgdept(String rmsgdept){
		this.rmsgdept = rmsgdept;
	}

	public void setRmsgdeptnm(String rmsgdeptnm){
		this.rmsgdeptnm = rmsgdeptnm;
	}

	public void setRmsgarea(String rmsgarea){
		this.rmsgarea = rmsgarea;
	}

	public void setRmsgareanm(String rmsgareanm){
		this.rmsgareanm = rmsgareanm;
	}

	public void setAnncbgntm(String anncbgntm){
		this.anncbgntm = anncbgntm;
	}

	public void setAnncendtm(String anncendtm){
		this.anncendtm = anncendtm;
	}

	public void setAnnctitl(String annctitl){
		this.annctitl = annctitl;
	}

	public void setAnnccont(String annccont){
		this.annccont = annccont;
	}

	public String getUid(){
		return this.uid;
	}

	public long getSeq(){
		return this.seq;
	}

	public String getRmsgdept(){
		return this.rmsgdept;
	}

	public String getRmsgdeptnm(){
		return this.rmsgdeptnm;
	}

	public String getRmsgarea(){
		return this.rmsgarea;
	}

	public String getRmsgareanm(){
		return this.rmsgareanm;
	}

	public String getAnncbgntm(){
		return this.anncbgntm;
	}

	public String getAnncendtm(){
		return this.anncendtm;
	}

	public String getAnnctitl(){
		return this.annctitl;
	}

	public String getAnnccont(){
		return this.annccont;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_ANNCBO( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_ANNCBODM dm = (SS_U_ANNCBODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setLong(4, dm.seq);
		cstmt.setString(5, dm.rmsgdept);
		cstmt.setString(6, dm.rmsgdeptnm);
		cstmt.setString(7, dm.rmsgarea);
		cstmt.setString(8, dm.rmsgareanm);
		cstmt.setString(9, dm.anncbgntm);
		cstmt.setString(10, dm.anncendtm);
		cstmt.setString(11, dm.annctitl);
		cstmt.setString(12, dm.annccont);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_U_ANNCBODataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String rmsgdept = req.getParameter("rmsgdept");
if( rmsgdept == null){
	System.out.println(this.toString+" : rmsgdept is null" );
}else{
	System.out.println(this.toString+" : rmsgdept is "+rmsgdept );
}
String rmsgdeptnm = req.getParameter("rmsgdeptnm");
if( rmsgdeptnm == null){
	System.out.println(this.toString+" : rmsgdeptnm is null" );
}else{
	System.out.println(this.toString+" : rmsgdeptnm is "+rmsgdeptnm );
}
String rmsgarea = req.getParameter("rmsgarea");
if( rmsgarea == null){
	System.out.println(this.toString+" : rmsgarea is null" );
}else{
	System.out.println(this.toString+" : rmsgarea is "+rmsgarea );
}
String rmsgareanm = req.getParameter("rmsgareanm");
if( rmsgareanm == null){
	System.out.println(this.toString+" : rmsgareanm is null" );
}else{
	System.out.println(this.toString+" : rmsgareanm is "+rmsgareanm );
}
String anncbgntm = req.getParameter("anncbgntm");
if( anncbgntm == null){
	System.out.println(this.toString+" : anncbgntm is null" );
}else{
	System.out.println(this.toString+" : anncbgntm is "+anncbgntm );
}
String anncendtm = req.getParameter("anncendtm");
if( anncendtm == null){
	System.out.println(this.toString+" : anncendtm is null" );
}else{
	System.out.println(this.toString+" : anncendtm is "+anncendtm );
}
String annctitl = req.getParameter("annctitl");
if( annctitl == null){
	System.out.println(this.toString+" : annctitl is null" );
}else{
	System.out.println(this.toString+" : annctitl is "+annctitl );
}
String annccont = req.getParameter("annccont");
if( annccont == null){
	System.out.println(this.toString+" : annccont is null" );
}else{
	System.out.println(this.toString+" : annccont is "+annccont );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String uid = Util.checkString(req.getParameter("uid"));
String seq = Util.checkString(req.getParameter("seq"));
String rmsgdept = Util.checkString(req.getParameter("rmsgdept"));
String rmsgdeptnm = Util.checkString(req.getParameter("rmsgdeptnm"));
String rmsgarea = Util.checkString(req.getParameter("rmsgarea"));
String rmsgareanm = Util.checkString(req.getParameter("rmsgareanm"));
String anncbgntm = Util.checkString(req.getParameter("anncbgntm"));
String anncendtm = Util.checkString(req.getParameter("anncendtm"));
String annctitl = Util.checkString(req.getParameter("annctitl"));
String annccont = Util.checkString(req.getParameter("annccont"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String rmsgdept = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgdept")));
String rmsgdeptnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgdeptnm")));
String rmsgarea = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgarea")));
String rmsgareanm = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsgareanm")));
String anncbgntm = Util.Uni2Ksc(Util.checkString(req.getParameter("anncbgntm")));
String anncendtm = Util.Uni2Ksc(Util.checkString(req.getParameter("anncendtm")));
String annctitl = Util.Uni2Ksc(Util.checkString(req.getParameter("annctitl")));
String annccont = Util.Uni2Ksc(Util.checkString(req.getParameter("annccont")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setSeq(seq);
dm.setRmsgdept(rmsgdept);
dm.setRmsgdeptnm(rmsgdeptnm);
dm.setRmsgarea(rmsgarea);
dm.setRmsgareanm(rmsgareanm);
dm.setAnncbgntm(anncbgntm);
dm.setAnncendtm(anncendtm);
dm.setAnnctitl(annctitl);
dm.setAnnccont(annccont);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 16 16:21:33 KST 2009 */