/***************************************************************************************************
* 파일명 : SE_SND_1920_LDM.java
* 기능 : 판매-발송관리-발송마스터
* 작성일자 : 2009-02-10
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.ds.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_1920_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String bo_cd;
	public String send_plac_seq;
	public String incmg_pers;

	public SE_SND_1920_LDM(){}
	public SE_SND_1920_LDM(String cmpy_cd, String bo_cd, String send_plac_seq, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.bo_cd = bo_cd;
		this.send_plac_seq = send_plac_seq;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_SND_1920_L( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_1920_LDM dm = (SE_SND_1920_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.bo_cd);
		cstmt.setString(5, dm.send_plac_seq);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_1920_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("bo_cd = " + getBo_cd());
        System.out.println("send_plac_seq = " + getSend_plac_seq());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String send_plac_seq = req.getParameter("send_plac_seq");
if( send_plac_seq == null){
	System.out.println(this.toString+" : send_plac_seq is null" );
}else{
	System.out.println(this.toString+" : send_plac_seq is "+send_plac_seq );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String send_plac_seq = Util.checkString(req.getParameter("send_plac_seq"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String send_plac_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_seq")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBo_cd(bo_cd);
dm.setSend_plac_seq(send_plac_seq);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 10 14:57:13 KST 2009 */