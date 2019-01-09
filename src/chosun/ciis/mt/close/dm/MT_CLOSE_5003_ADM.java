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


package chosun.ciis.mt.close.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.close.ds.*;
import chosun.ciis.mt.close.rec.*;

/**
 * 
 */


public class MT_CLOSE_5003_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String in_yymm;
	public String slip_ymd;
	public String in_sabeon;
	public String in_ipaddress;

	public MT_CLOSE_5003_ADM(){}
	public MT_CLOSE_5003_ADM(String cmpy_cd, String in_yymm, String slip_ymd, String in_sabeon, String in_ipaddress){
		this.cmpy_cd = cmpy_cd;
		this.in_yymm = in_yymm;
		this.slip_ymd = slip_ymd;
		this.in_sabeon = in_sabeon;
		this.in_ipaddress = in_ipaddress;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIn_yymm(String in_yymm){
		this.in_yymm = in_yymm;
	}

	public void setSlip_ymd(String slip_ymd){
		this.slip_ymd = slip_ymd;
	}

	public void setIn_sabeon(String in_sabeon){
		this.in_sabeon = in_sabeon;
	}

	public void setIn_ipaddress(String in_ipaddress){
		this.in_ipaddress = in_ipaddress;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIn_yymm(){
		return this.in_yymm;
	}

	public String getSlip_ymd(){
		return this.slip_ymd;
	}

	public String getIn_sabeon(){
		return this.in_sabeon;
	}

	public String getIn_ipaddress(){
		return this.in_ipaddress;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_CLOSE_5003_A(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_CLOSE_5003_ADM dm = (MT_CLOSE_5003_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.in_yymm);
		cstmt.setString(5, dm.slip_ymd);
		cstmt.setString(6, dm.in_sabeon);
		cstmt.setString(7, dm.in_ipaddress);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.close.ds.MT_CLOSE_5003_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("in_yymm = [" + getIn_yymm() + "]");
		System.out.println("slip_ymd = [" + getSlip_ymd() + "]");
		System.out.println("in_sabeon = [" + getIn_sabeon() + "]");
		System.out.println("in_ipaddress = [" + getIn_ipaddress() + "]");
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
String in_yymm = req.getParameter("in_yymm");
if( in_yymm == null){
	System.out.println(this.toString+" : in_yymm is null" );
}else{
	System.out.println(this.toString+" : in_yymm is "+in_yymm );
}
String slip_ymd = req.getParameter("slip_ymd");
if( slip_ymd == null){
	System.out.println(this.toString+" : slip_ymd is null" );
}else{
	System.out.println(this.toString+" : slip_ymd is "+slip_ymd );
}
String in_sabeon = req.getParameter("in_sabeon");
if( in_sabeon == null){
	System.out.println(this.toString+" : in_sabeon is null" );
}else{
	System.out.println(this.toString+" : in_sabeon is "+in_sabeon );
}
String in_ipaddress = req.getParameter("in_ipaddress");
if( in_ipaddress == null){
	System.out.println(this.toString+" : in_ipaddress is null" );
}else{
	System.out.println(this.toString+" : in_ipaddress is "+in_ipaddress );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String in_yymm = Util.checkString(req.getParameter("in_yymm"));
String slip_ymd = Util.checkString(req.getParameter("slip_ymd"));
String in_sabeon = Util.checkString(req.getParameter("in_sabeon"));
String in_ipaddress = Util.checkString(req.getParameter("in_ipaddress"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String in_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("in_yymm")));
String slip_ymd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_ymd")));
String in_sabeon = Util.Uni2Ksc(Util.checkString(req.getParameter("in_sabeon")));
String in_ipaddress = Util.Uni2Ksc(Util.checkString(req.getParameter("in_ipaddress")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIn_yymm(in_yymm);
dm.setSlip_ymd(slip_ymd);
dm.setIn_sabeon(in_sabeon);
dm.setIn_ipaddress(in_ipaddress);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 24 09:23:32 KST 2009 */