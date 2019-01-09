/***************************************************************************************************
* 파일명 : SL_L_RDR_MOVMWORKDM.java
* 기능 : 관할지국조정관리-인계(인계작업목록검색)
*       관할지국조정관리-인수(인수작업목록검색)
* 작성일자 : 2004-02-07
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.ds.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 관할지국조정관리-인계(인계작업목록검색)
 * 관할지국조정관리-인수(인수작업목록검색)
 * 특기사항 : 유지보수자는 관할지국조정관리(인계와 인수에 동시 쓰임에 유의할 것)
 */


public class SL_L_RDR_MOVMWORKDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String actrclsf;

	public SL_L_RDR_MOVMWORKDM(){}
	public SL_L_RDR_MOVMWORKDM(String bocd, String actrclsf){
		this.bocd = bocd;
		this.actrclsf = actrclsf;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setActrclsf(String actrclsf){
		this.actrclsf = actrclsf;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getActrclsf(){
		return this.actrclsf;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_RDR_MOVMWORK( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_RDR_MOVMWORKDM dm = (SL_L_RDR_MOVMWORKDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.actrclsf);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_L_RDR_MOVMWORKDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String actrclsf = req.getParameter("actrclsf");
if( actrclsf == null){
	System.out.println(this.toString+" : actrclsf is null" );
}else{
	System.out.println(this.toString+" : actrclsf is "+actrclsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String actrclsf = Util.checkString(req.getParameter("actrclsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String actrclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("actrclsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setActrclsf(actrclsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Feb 07 16:47:38 KST 2004 */