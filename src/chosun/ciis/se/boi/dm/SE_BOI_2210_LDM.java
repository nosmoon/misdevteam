/***************************************************************************************************
* 파일명 : SE_BOI_2210_LDM.java
* 기능 : 판촉물관리 - 판촉물등록
* 작성일자 : 2009-03-16
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.boi.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.ds.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_2210_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yy;
	public String sido;
	public String gugun;
	public String dong;
	public String gb;
	
	public SE_BOI_2210_LDM(){}
	public SE_BOI_2210_LDM(String cmpy_cd, String yy, String sido, String gugun, String dong, String gb){
		this.cmpy_cd = cmpy_cd;
		this.yy = yy;
		this.sido = sido;
		this.gugun = gugun;
		this.dong = dong;
		this.gb = gb;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setSido(String sido){
		this.sido = sido;
	}

	public void setGugun(String gugun){
		this.gugun = gugun;
	}

	public void setDong(String dong){
		this.dong = dong;
	}

	public void setGb(String gb){
		this.gb = gb;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYy(){
		return this.yy;
	}

	public String getSido(){
		return this.sido;
	}

	public String getGugun(){
		return this.gugun;
	}

	public String getDong(){
		return this.dong;
	}

	public String getGb(){
		return this.gb;
	}

	public String getSQL(){
		 return "{ call SP_SE_BOI_2210_L( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_2210_LDM dm = (SE_BOI_2210_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yy);
		cstmt.setString(5, dm.sido);
		cstmt.setString(6, dm.gugun);
		cstmt.setString(7, dm.dong);
		cstmt.setString(8, dm.gb);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_2210_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("yy = " + getYy());
        System.out.println("sido = " + getSido());
        System.out.println("gugun = " + getGugun());
        System.out.println("dong = " + getDong());
        System.out.println("gb = " + getGb());
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
String yy = req.getParameter("yy");
if( yy == null){
	System.out.println(this.toString+" : yy is null" );
}else{
	System.out.println(this.toString+" : yy is "+yy );
}
String sido = req.getParameter("sido");
if( sido == null){
	System.out.println(this.toString+" : sido is null" );
}else{
	System.out.println(this.toString+" : sido is "+sido );
}
String gugun = req.getParameter("gugun");
if( gugun == null){
	System.out.println(this.toString+" : gugun is null" );
}else{
	System.out.println(this.toString+" : gugun is "+gugun );
}
String dong = req.getParameter("dong");
if( dong == null){
	System.out.println(this.toString+" : dong is null" );
}else{
	System.out.println(this.toString+" : dong is "+dong );
}
String gb = req.getParameter("gb");
if( gb == null){
	System.out.println(this.toString+" : gb is null" );
}else{
	System.out.println(this.toString+" : gb is "+gb );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yy = Util.checkString(req.getParameter("yy"));
String sido = Util.checkString(req.getParameter("sido"));
String gugun = Util.checkString(req.getParameter("gugun"));
String dong = Util.checkString(req.getParameter("dong"));
String gb = Util.checkString(req.getParameter("gb"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yy = Util.Uni2Ksc(Util.checkString(req.getParameter("yy")));
String sido = Util.Uni2Ksc(Util.checkString(req.getParameter("sido")));
String gugun = Util.Uni2Ksc(Util.checkString(req.getParameter("gugun")));
String dong = Util.Uni2Ksc(Util.checkString(req.getParameter("dong")));
String gb = Util.Uni2Ksc(Util.checkString(req.getParameter("gb")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYy(yy);
dm.setSido(sido);
dm.setGugun(gugun);
dm.setDong(dong);
dm.setGb(gb);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 22 17:52:50 KST 2009 */