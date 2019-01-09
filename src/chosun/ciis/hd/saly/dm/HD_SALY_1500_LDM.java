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


package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_1500_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String saly_yy_nw;
	public String saly_no_nw;
	public String saly_yy_be;
	public String saly_no_be;

	public HD_SALY_1500_LDM(){}
	public HD_SALY_1500_LDM(String cmpy_cd, String saly_yy_nw, String saly_no_nw, String saly_yy_be, String saly_no_be){
		this.cmpy_cd = cmpy_cd;
		this.saly_yy_nw = saly_yy_nw;
		this.saly_no_nw = saly_no_nw;
		this.saly_yy_be = saly_yy_be;
		this.saly_no_be = saly_no_be;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSaly_yy_nw(String saly_yy_nw){
		this.saly_yy_nw = saly_yy_nw;
	}

	public void setSaly_no_nw(String saly_no_nw){
		this.saly_no_nw = saly_no_nw;
	}

	public void setSaly_yy_be(String saly_yy_be){
		this.saly_yy_be = saly_yy_be;
	}

	public void setSaly_no_be(String saly_no_be){
		this.saly_no_be = saly_no_be;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSaly_yy_nw(){
		return this.saly_yy_nw;
	}

	public String getSaly_no_nw(){
		return this.saly_no_nw;
	}

	public String getSaly_yy_be(){
		return this.saly_yy_be;
	}

	public String getSaly_no_be(){
		return this.saly_no_be;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_1500_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_1500_LDM dm = (HD_SALY_1500_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.saly_yy_nw);
		cstmt.setString(5, dm.saly_no_nw);
		cstmt.setString(6, dm.saly_yy_be);
		cstmt.setString(7, dm.saly_no_be);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_1500_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("saly_yy_nw = [" + getSaly_yy_nw() + "]");
		System.out.println("saly_no_nw = [" + getSaly_no_nw() + "]");
		System.out.println("saly_yy_be = [" + getSaly_yy_be() + "]");
		System.out.println("saly_no_be = [" + getSaly_no_be() + "]");
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
String saly_yy_nw = req.getParameter("saly_yy_nw");
if( saly_yy_nw == null){
	System.out.println(this.toString+" : saly_yy_nw is null" );
}else{
	System.out.println(this.toString+" : saly_yy_nw is "+saly_yy_nw );
}
String saly_no_nw = req.getParameter("saly_no_nw");
if( saly_no_nw == null){
	System.out.println(this.toString+" : saly_no_nw is null" );
}else{
	System.out.println(this.toString+" : saly_no_nw is "+saly_no_nw );
}
String saly_yy_be = req.getParameter("saly_yy_be");
if( saly_yy_be == null){
	System.out.println(this.toString+" : saly_yy_be is null" );
}else{
	System.out.println(this.toString+" : saly_yy_be is "+saly_yy_be );
}
String saly_no_be = req.getParameter("saly_no_be");
if( saly_no_be == null){
	System.out.println(this.toString+" : saly_no_be is null" );
}else{
	System.out.println(this.toString+" : saly_no_be is "+saly_no_be );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String saly_yy_nw = Util.checkString(req.getParameter("saly_yy_nw"));
String saly_no_nw = Util.checkString(req.getParameter("saly_no_nw"));
String saly_yy_be = Util.checkString(req.getParameter("saly_yy_be"));
String saly_no_be = Util.checkString(req.getParameter("saly_no_be"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String saly_yy_nw = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_yy_nw")));
String saly_no_nw = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_no_nw")));
String saly_yy_be = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_yy_be")));
String saly_no_be = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_no_be")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSaly_yy_nw(saly_yy_nw);
dm.setSaly_no_nw(saly_no_nw);
dm.setSaly_yy_be(saly_yy_be);
dm.setSaly_no_be(saly_no_be);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 22 11:12:22 KST 2009 */