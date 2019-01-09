/***************************************************************************************************
* 파일명 : SE_BNS_1520_SDM.java
* 기능 : 판매 - 판촉물관리 - 판촉물배분처리
* 작성일자 : 2009-05-06
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bns.ds.*;
import chosun.ciis.se.bns.rec.*;

/**
 * 
 */


public class SE_BNS_1520_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd	;
	public String yymm		;
	public String medi_cd	;
	public String tms		;
	public String incmg_pers;
	
	public SE_BNS_1520_SDM(){}
	public SE_BNS_1520_SDM(String cmpy_cd, String yymm, String medi_cd, String tms, String incmg_pers){
		this.cmpy_cd 	= cmpy_cd	;
		this.yymm 		= yymm		;
		this.medi_cd 	= medi_cd	;
		this.tms 		= tms		;
		this.incmg_pers	= incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getTms(){
		return this.tms;
	}

	public String getSQL(){
		 return "{ call SP_SE_BNS_1520_S( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BNS_1520_SDM dm = (SE_BNS_1520_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd	);
		cstmt.setString(4, dm.yymm		);
		cstmt.setString(5, dm.medi_cd	);
		cstmt.setString(6, dm.tms		);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.registerOutParameter(8, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.bns.ds.SE_BNS_1520_SDataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 	= " + getCmpy_cd	());
        System.out.println("yymm 		= " + getYymm		());
        System.out.println("medi_cd 	= " + getMedi_cd	());
        System.out.println("tms 		= " + getTms		());
        System.out.println("incmg_pers 	= " + getIncmg_pers	());
    }
	public String getIncmg_pers() {
		return incmg_pers;
	}
	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String tms = Util.checkString(req.getParameter("tms"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setMedi_cd(medi_cd);
dm.setTms(tms);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 06 13:56:45 KST 2009 */