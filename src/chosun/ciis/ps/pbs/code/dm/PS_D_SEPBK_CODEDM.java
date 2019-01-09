/***************************************************************************************************
* 파일명 : 
* 기능 :  단행본 코드관리 
* 작성일자 : 2004-02-20
* 작성자 : 장수환
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.code.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.code.ds.*;
import chosun.ciis.ps.pbs.code.rec.*;

/**
 * 단행본-단행본 코드관리
 *
 */

public class PS_D_SEPBK_CODEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String medicd;
	public String mediser_no;

	public PS_D_SEPBK_CODEDM(){}
	public PS_D_SEPBK_CODEDM(String medicd, String mediser_no){
		this.medicd = medicd;
		this.mediser_no = mediser_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMediser_no(String mediser_no){
		this.mediser_no = mediser_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMediser_no(){
		return this.mediser_no;
	}

	public String getSQL(){
		 return "{ call SP_PS_D_SEPBK_CODE( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_D_SEPBK_CODEDM dm = (PS_D_SEPBK_CODEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.medicd);
		cstmt.setString(4, dm.mediser_no);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.code.ds.PS_D_SEPBK_CODEDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String mediser_no = req.getParameter("mediser_no");
if( mediser_no == null){
	System.out.println(this.toString+" : mediser_no is null" );
}else{
	System.out.println(this.toString+" : mediser_no is "+mediser_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String medicd = Util.checkString(req.getParameter("medicd"));
String mediser_no = Util.checkString(req.getParameter("mediser_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String mediser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mediser_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMedicd(medicd);
dm.setMediser_no(mediser_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 25 14:28:19 KST 2004 */