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


package chosun.ciis.mt.submatrcla.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrcla.ds.*;
import chosun.ciis.mt.submatrcla.rec.*;

/**
 * 
 */


public class MT_SUBMATRCLA_1111_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acpn_dt_fr;
	public String acpn_dt_to;
	public String decid_key;

	public MT_SUBMATRCLA_1111_UDM(){}
	public MT_SUBMATRCLA_1111_UDM(String cmpy_cd, String acpn_dt_fr, String acpn_dt_to, String decid_key){
		this.cmpy_cd = cmpy_cd;
		this.acpn_dt_fr = acpn_dt_fr;
		this.acpn_dt_to = acpn_dt_to;
		this.decid_key = decid_key;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcpn_dt_fr(String acpn_dt_fr){
		this.acpn_dt_fr = acpn_dt_fr;
	}

	public void setAcpn_dt_to(String acpn_dt_to){
		this.acpn_dt_to = acpn_dt_to;
	}

	public void setDecid_key(String decid_key){
		this.decid_key = decid_key;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcpn_dt_fr(){
		return this.acpn_dt_fr;
	}

	public String getAcpn_dt_to(){
		return this.acpn_dt_to;
	}

	public String getDecid_key(){
		return this.decid_key;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATRCLA_1111_U(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATRCLA_1111_UDM dm = (MT_SUBMATRCLA_1111_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acpn_dt_fr);
		cstmt.setString(5, dm.acpn_dt_to);
		cstmt.setString(6, dm.decid_key);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrcla.ds.MT_SUBMATRCLA_1111_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acpn_dt_fr = [" + getAcpn_dt_fr() + "]");
		System.out.println("acpn_dt_to = [" + getAcpn_dt_to() + "]");
		System.out.println("decid_key = [" + getDecid_key() + "]");
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
String acpn_dt_fr = req.getParameter("acpn_dt_fr");
if( acpn_dt_fr == null){
	System.out.println(this.toString+" : acpn_dt_fr is null" );
}else{
	System.out.println(this.toString+" : acpn_dt_fr is "+acpn_dt_fr );
}
String acpn_dt_to = req.getParameter("acpn_dt_to");
if( acpn_dt_to == null){
	System.out.println(this.toString+" : acpn_dt_to is null" );
}else{
	System.out.println(this.toString+" : acpn_dt_to is "+acpn_dt_to );
}
String decid_key = req.getParameter("decid_key");
if( decid_key == null){
	System.out.println(this.toString+" : decid_key is null" );
}else{
	System.out.println(this.toString+" : decid_key is "+decid_key );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acpn_dt_fr = Util.checkString(req.getParameter("acpn_dt_fr"));
String acpn_dt_to = Util.checkString(req.getParameter("acpn_dt_to"));
String decid_key = Util.checkString(req.getParameter("decid_key"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acpn_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_dt_fr")));
String acpn_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_dt_to")));
String decid_key = Util.Uni2Ksc(Util.checkString(req.getParameter("decid_key")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAcpn_dt_fr(acpn_dt_fr);
dm.setAcpn_dt_to(acpn_dt_to);
dm.setDecid_key(decid_key);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 10 20:24:41 KST 2009 */