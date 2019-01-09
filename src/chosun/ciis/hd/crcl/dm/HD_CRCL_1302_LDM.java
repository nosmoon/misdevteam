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


package chosun.ciis.hd.crcl.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.crcl.ds.*;
import chosun.ciis.hd.crcl.rec.*;

/**
 * 
 */


public class HD_CRCL_1302_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String paty_crc_cd;
	public String dty_cd;

	public HD_CRCL_1302_LDM(){}
	public HD_CRCL_1302_LDM(String cmpy_cd, String paty_crc_cd, String dty_cd){
		this.cmpy_cd = cmpy_cd;
		this.paty_crc_cd = paty_crc_cd;
		this.dty_cd = dty_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPaty_crc_cd(String paty_crc_cd){
		this.paty_crc_cd = paty_crc_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPaty_crc_cd(){
		return this.paty_crc_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_CRCL_1302_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_CRCL_1302_LDM dm = (HD_CRCL_1302_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.paty_crc_cd);
		cstmt.setString(5, dm.dty_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.crcl.ds.HD_CRCL_1302_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("paty_crc_cd = " + getPaty_crc_cd());
        System.out.println("dty_cd = " + getDty_cd());
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
String paty_crc_cd = req.getParameter("paty_crc_cd");
if( paty_crc_cd == null){
	System.out.println(this.toString+" : paty_crc_cd is null" );
}else{
	System.out.println(this.toString+" : paty_crc_cd is "+paty_crc_cd );
}
String dty_cd = req.getParameter("dty_cd");
if( dty_cd == null){
	System.out.println(this.toString+" : dty_cd is null" );
}else{
	System.out.println(this.toString+" : dty_cd is "+dty_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String paty_crc_cd = Util.checkString(req.getParameter("paty_crc_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String paty_crc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("paty_crc_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPaty_crc_cd(paty_crc_cd);
dm.setDty_cd(dty_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 19 09:45:44 KST 2009 */