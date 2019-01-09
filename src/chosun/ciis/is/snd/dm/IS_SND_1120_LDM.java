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


package chosun.ciis.is.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.snd.ds.*;
import chosun.ciis.is.snd.rec.*;

/**
 * 
 */


public class IS_SND_1120_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acwr_reg_dt;
	public String acwr_reg_seq;
	public String wh_cd;

	public IS_SND_1120_LDM(){}
	public IS_SND_1120_LDM(String cmpy_cd, String acwr_reg_dt, String acwr_reg_seq, String wh_cd){
		this.cmpy_cd = cmpy_cd;
		this.acwr_reg_dt = acwr_reg_dt;
		this.acwr_reg_seq = acwr_reg_seq;
		this.wh_cd = wh_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcwr_reg_dt(String acwr_reg_dt){
		this.acwr_reg_dt = acwr_reg_dt;
	}

	public void setAcwr_reg_seq(String acwr_reg_seq){
		this.acwr_reg_seq = acwr_reg_seq;
	}

	public void setWh_cd(String wh_cd){
		this.wh_cd = wh_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcwr_reg_dt(){
		return this.acwr_reg_dt;
	}

	public String getAcwr_reg_seq(){
		return this.acwr_reg_seq;
	}

	public String getWh_cd(){
		return this.wh_cd;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_SND_1120_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_SND_1120_LDM dm = (IS_SND_1120_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acwr_reg_dt);
		cstmt.setString(5, dm.acwr_reg_seq);
		cstmt.setString(6, dm.wh_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.snd.ds.IS_SND_1120_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acwr_reg_dt = [" + getAcwr_reg_dt() + "]");
		System.out.println("acwr_reg_seq = [" + getAcwr_reg_seq() + "]");
		System.out.println("wh_cd = [" + getWh_cd() + "]");
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
String acwr_reg_dt = req.getParameter("acwr_reg_dt");
if( acwr_reg_dt == null){
	System.out.println(this.toString+" : acwr_reg_dt is null" );
}else{
	System.out.println(this.toString+" : acwr_reg_dt is "+acwr_reg_dt );
}
String acwr_reg_seq = req.getParameter("acwr_reg_seq");
if( acwr_reg_seq == null){
	System.out.println(this.toString+" : acwr_reg_seq is null" );
}else{
	System.out.println(this.toString+" : acwr_reg_seq is "+acwr_reg_seq );
}
String wh_cd = req.getParameter("wh_cd");
if( wh_cd == null){
	System.out.println(this.toString+" : wh_cd is null" );
}else{
	System.out.println(this.toString+" : wh_cd is "+wh_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acwr_reg_dt = Util.checkString(req.getParameter("acwr_reg_dt"));
String acwr_reg_seq = Util.checkString(req.getParameter("acwr_reg_seq"));
String wh_cd = Util.checkString(req.getParameter("wh_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acwr_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("acwr_reg_dt")));
String acwr_reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("acwr_reg_seq")));
String wh_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("wh_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAcwr_reg_dt(acwr_reg_dt);
dm.setAcwr_reg_seq(acwr_reg_seq);
dm.setWh_cd(wh_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 24 14:39:11 KST 2012 */