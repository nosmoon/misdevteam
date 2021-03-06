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


package chosun.ciis.tn.rpt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.rpt.ds.*;
import chosun.ciis.tn.rpt.rec.*;

/**
 * 
 */


public class TN_RPT_1520_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String memberidx;
	public String promiseidx;
	public String seq;
	public String code;

	public TN_RPT_1520_LDM(){}
	public TN_RPT_1520_LDM(String cmpy_cd, String memberidx, String promiseidx, String seq, String code){
		this.cmpy_cd = cmpy_cd;
		this.memberidx = memberidx;
		this.promiseidx = promiseidx;
		this.seq = seq;
		this.code = code;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setPromiseidx(String promiseidx){
		this.promiseidx = promiseidx;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getPromiseidx(){
		return this.promiseidx;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getCode(){
		return this.code;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_RPT_1520_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_RPT_1520_LDM dm = (TN_RPT_1520_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.memberidx);
		cstmt.setString(5, dm.promiseidx);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.code);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.rpt.ds.TN_RPT_1520_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("memberidx = [" + getMemberidx() + "]");
		System.out.println("promiseidx = [" + getPromiseidx() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("code = [" + getCode() + "]");
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String code = req.getParameter("code");
if( code == null){
	System.out.println(this.toString+" : code is null" );
}else{
	System.out.println(this.toString+" : code is "+code );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String memberidx = Util.checkString(req.getParameter("memberidx"));
String promiseidx = Util.checkString(req.getParameter("promiseidx"));
String seq = Util.checkString(req.getParameter("seq"));
String code = Util.checkString(req.getParameter("code"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String memberidx = Util.Uni2Ksc(Util.checkString(req.getParameter("memberidx")));
String promiseidx = Util.Uni2Ksc(Util.checkString(req.getParameter("promiseidx")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String code = Util.Uni2Ksc(Util.checkString(req.getParameter("code")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMemberidx(memberidx);
dm.setPromiseidx(promiseidx);
dm.setSeq(seq);
dm.setCode(code);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 10 16:08:51 KST 2016 */