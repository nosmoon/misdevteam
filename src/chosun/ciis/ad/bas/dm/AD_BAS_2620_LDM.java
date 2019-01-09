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


package chosun.ciis.ad.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.ds.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_2620_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String trgt_clsf;
	public String trgt_yymm;

	public AD_BAS_2620_LDM(){}
	public AD_BAS_2620_LDM(String cmpy_cd, String trgt_clsf, String trgt_yymm){
		this.cmpy_cd = cmpy_cd;
		this.trgt_clsf = trgt_clsf;
		this.trgt_yymm = trgt_yymm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTrgt_clsf(String trgt_clsf){
		this.trgt_clsf = trgt_clsf;
	}

	public void setTrgt_yymm(String trgt_yymm){
		this.trgt_yymm = trgt_yymm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTrgt_clsf(){
		return this.trgt_clsf;
	}

	public String getTrgt_yymm(){
		return this.trgt_yymm;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_2620_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_2620_LDM dm = (AD_BAS_2620_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.trgt_clsf);
		cstmt.setString(5, dm.trgt_yymm);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_2620_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("trgt_clsf = [" + getTrgt_clsf() + "]");
		System.out.println("trgt_yymm = [" + getTrgt_yymm() + "]");
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
String trgt_clsf = req.getParameter("trgt_clsf");
if( trgt_clsf == null){
	System.out.println(this.toString+" : trgt_clsf is null" );
}else{
	System.out.println(this.toString+" : trgt_clsf is "+trgt_clsf );
}
String trgt_yymm = req.getParameter("trgt_yymm");
if( trgt_yymm == null){
	System.out.println(this.toString+" : trgt_yymm is null" );
}else{
	System.out.println(this.toString+" : trgt_yymm is "+trgt_yymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String trgt_clsf = Util.checkString(req.getParameter("trgt_clsf"));
String trgt_yymm = Util.checkString(req.getParameter("trgt_yymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String trgt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_clsf")));
String trgt_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt_yymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTrgt_clsf(trgt_clsf);
dm.setTrgt_yymm(trgt_yymm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 25 12:23:19 KST 2009 */