/***************************************************************************************************
* 파일명 : .java
* 기능 : * 관리자-담당별 우편번호 엑셀 일괄등록
* 작성일자 : 2010-08-17
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 *  관리자-담당별 우편번호 엑셀 일괄등록
 */

public class SS_L_UPLOADZIPCODEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String gubun_cnfm;
	public String oldzip1_cnfm;
	public String oldzip2_cnfm;
	public String oldzip3_cnfm;
	public String oldzip4_cnfm;
	public String oldaddr1_cnfm;
	public String oldaddr2_cnfm;
	public String oldaddr3_cnfm;
	public String oldaddr4_cnfm;
	public String oldbgnbnji_cnfm;
	public String oldendbnji_cnfm;
	public String newzip1_cnfm;
	public String newzip2_cnfm;
	public String newzip3_cnfm;
	public String newzip4_cnfm;
	public String newaddr1_cnfm;
	public String newaddr2_cnfm;
	public String newaddr3_cnfm;
	public String newaddr4_cnfm;
	public String newbgnbnji_cnfm;
	public String newendbnji_cnfm;
	public String chgresn_cnfm;

	public SS_L_UPLOADZIPCODEDM(){}
	public SS_L_UPLOADZIPCODEDM(String uid, String gubun_cnfm, String oldzip1_cnfm, String oldzip2_cnfm, String oldzip3_cnfm, String oldzip4_cnfm, String oldaddr1_cnfm, String oldaddr2_cnfm, String oldaddr3_cnfm, String oldaddr4_cnfm, String oldbgnbnji_cnfm, String oldendbnji_cnfm, String newzip1_cnfm, String newzip2_cnfm, String newzip3_cnfm, String newzip4_cnfm, String newaddr1_cnfm, String newaddr2_cnfm, String newaddr3_cnfm, String newaddr4_cnfm, String newbgnbnji_cnfm, String newendbnji_cnfm, String chgresn_cnfm){
		this.uid = uid;
		this.gubun_cnfm = gubun_cnfm;
		this.oldzip1_cnfm = oldzip1_cnfm;
		this.oldzip2_cnfm = oldzip2_cnfm;
		this.oldzip3_cnfm = oldzip3_cnfm;
		this.oldzip4_cnfm = oldzip4_cnfm;
		this.oldaddr1_cnfm = oldaddr1_cnfm;
		this.oldaddr2_cnfm = oldaddr2_cnfm;
		this.oldaddr3_cnfm = oldaddr3_cnfm;
		this.oldaddr4_cnfm = oldaddr4_cnfm;
		this.oldbgnbnji_cnfm = oldbgnbnji_cnfm;
		this.oldendbnji_cnfm = oldendbnji_cnfm;
		this.newzip1_cnfm = newzip1_cnfm;
		this.newzip2_cnfm = newzip2_cnfm;
		this.newzip3_cnfm = newzip3_cnfm;
		this.newzip4_cnfm = newzip4_cnfm;
		this.newaddr1_cnfm = newaddr1_cnfm;
		this.newaddr2_cnfm = newaddr2_cnfm;
		this.newaddr3_cnfm = newaddr3_cnfm;
		this.newaddr4_cnfm = newaddr4_cnfm;
		this.newbgnbnji_cnfm = newbgnbnji_cnfm;
		this.newendbnji_cnfm = newendbnji_cnfm;
		this.chgresn_cnfm = chgresn_cnfm;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setGubun_cnfm(String gubun_cnfm){
		this.gubun_cnfm = gubun_cnfm;
	}

	public void setOldzip1_cnfm(String oldzip1_cnfm){
		this.oldzip1_cnfm = oldzip1_cnfm;
	}

	public void setOldzip2_cnfm(String oldzip2_cnfm){
		this.oldzip2_cnfm = oldzip2_cnfm;
	}

	public void setOldzip3_cnfm(String oldzip3_cnfm){
		this.oldzip3_cnfm = oldzip3_cnfm;
	}

	public void setOldzip4_cnfm(String oldzip4_cnfm){
		this.oldzip4_cnfm = oldzip4_cnfm;
	}

	public void setOldaddr1_cnfm(String oldaddr1_cnfm){
		this.oldaddr1_cnfm = oldaddr1_cnfm;
	}

	public void setOldaddr2_cnfm(String oldaddr2_cnfm){
		this.oldaddr2_cnfm = oldaddr2_cnfm;
	}

	public void setOldaddr3_cnfm(String oldaddr3_cnfm){
		this.oldaddr3_cnfm = oldaddr3_cnfm;
	}

	public void setOldaddr4_cnfm(String oldaddr4_cnfm){
		this.oldaddr4_cnfm = oldaddr4_cnfm;
	}

	public void setOldbgnbnji_cnfm(String oldbgnbnji_cnfm){
		this.oldbgnbnji_cnfm = oldbgnbnji_cnfm;
	}

	public void setOldendbnji_cnfm(String oldendbnji_cnfm){
		this.oldendbnji_cnfm = oldendbnji_cnfm;
	}

	public void setNewzip1_cnfm(String newzip1_cnfm){
		this.newzip1_cnfm = newzip1_cnfm;
	}

	public void setNewzip2_cnfm(String newzip2_cnfm){
		this.newzip2_cnfm = newzip2_cnfm;
	}

	public void setNewzip3_cnfm(String newzip3_cnfm){
		this.newzip3_cnfm = newzip3_cnfm;
	}

	public void setNewzip4_cnfm(String newzip4_cnfm){
		this.newzip4_cnfm = newzip4_cnfm;
	}

	public void setNewaddr1_cnfm(String newaddr1_cnfm){
		this.newaddr1_cnfm = newaddr1_cnfm;
	}

	public void setNewaddr2_cnfm(String newaddr2_cnfm){
		this.newaddr2_cnfm = newaddr2_cnfm;
	}

	public void setNewaddr3_cnfm(String newaddr3_cnfm){
		this.newaddr3_cnfm = newaddr3_cnfm;
	}

	public void setNewaddr4_cnfm(String newaddr4_cnfm){
		this.newaddr4_cnfm = newaddr4_cnfm;
	}

	public void setNewbgnbnji_cnfm(String newbgnbnji_cnfm){
		this.newbgnbnji_cnfm = newbgnbnji_cnfm;
	}

	public void setNewendbnji_cnfm(String newendbnji_cnfm){
		this.newendbnji_cnfm = newendbnji_cnfm;
	}

	public void setChgresn_cnfm(String chgresn_cnfm){
		this.chgresn_cnfm = chgresn_cnfm;
	}

	public String getUid(){
		return this.uid;
	}

	public String getGubun_cnfm(){
		return this.gubun_cnfm;
	}

	public String getOldzip1_cnfm(){
		return this.oldzip1_cnfm;
	}

	public String getOldzip2_cnfm(){
		return this.oldzip2_cnfm;
	}

	public String getOldzip3_cnfm(){
		return this.oldzip3_cnfm;
	}

	public String getOldzip4_cnfm(){
		return this.oldzip4_cnfm;
	}

	public String getOldaddr1_cnfm(){
		return this.oldaddr1_cnfm;
	}

	public String getOldaddr2_cnfm(){
		return this.oldaddr2_cnfm;
	}

	public String getOldaddr3_cnfm(){
		return this.oldaddr3_cnfm;
	}

	public String getOldaddr4_cnfm(){
		return this.oldaddr4_cnfm;
	}

	public String getOldbgnbnji_cnfm(){
		return this.oldbgnbnji_cnfm;
	}

	public String getOldendbnji_cnfm(){
		return this.oldendbnji_cnfm;
	}

	public String getNewzip1_cnfm(){
		return this.newzip1_cnfm;
	}

	public String getNewzip2_cnfm(){
		return this.newzip2_cnfm;
	}

	public String getNewzip3_cnfm(){
		return this.newzip3_cnfm;
	}

	public String getNewzip4_cnfm(){
		return this.newzip4_cnfm;
	}

	public String getNewaddr1_cnfm(){
		return this.newaddr1_cnfm;
	}

	public String getNewaddr2_cnfm(){
		return this.newaddr2_cnfm;
	}

	public String getNewaddr3_cnfm(){
		return this.newaddr3_cnfm;
	}

	public String getNewaddr4_cnfm(){
		return this.newaddr4_cnfm;
	}

	public String getNewbgnbnji_cnfm(){
		return this.newbgnbnji_cnfm;
	}

	public String getNewendbnji_cnfm(){
		return this.newendbnji_cnfm;
	}

	public String getChgresn_cnfm(){
		return this.chgresn_cnfm;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_UPLOADZIPCODE( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_UPLOADZIPCODEDM dm = (SS_L_UPLOADZIPCODEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		String temp = "gubun_cnfm";
		try {
			if(dm.gubun_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(4, new java.io.StringReader(dm.gubun_cnfm), dm.gubun_cnfm.length());
			}
			else{
				cstmt.setString(4, dm.gubun_cnfm);
			}
			
			temp = "oldzip1_cnfm";
			if(dm.oldzip1_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(5, new java.io.StringReader(dm.oldzip1_cnfm), dm.oldzip1_cnfm.length());
			}
			else{
				cstmt.setString(5, dm.oldzip1_cnfm);
			}
			
			temp = "oldzip2_cnfm";
			if(dm.oldzip2_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(4, new java.io.StringReader(dm.oldzip2_cnfm), dm.oldzip2_cnfm.length());
			}
			else{
				cstmt.setString(6, dm.oldzip2_cnfm);
			}
			
			temp = "oldzip3_cnfm";
			if(dm.oldzip3_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(4, new java.io.StringReader(dm.oldzip3_cnfm), dm.oldzip3_cnfm.length());
			}
			else{
				cstmt.setString(7, dm.oldzip3_cnfm);
			}
			
			temp = "oldzip4_cnfm";
			if(dm.oldzip4_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(4, new java.io.StringReader(dm.oldzip4_cnfm), dm.oldzip4_cnfm.length());
			}
			else{
				cstmt.setString(8, dm.oldzip4_cnfm);
			}
			
			temp = "oldaddr1_cnfm";
			if(dm.oldaddr1_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(4, new java.io.StringReader(dm.oldaddr1_cnfm), dm.oldaddr1_cnfm.length());
			}
			else{
				cstmt.setString(9, dm.oldaddr1_cnfm);
			}
			
			temp = "oldaddr2_cnfm";
			if(dm.oldaddr2_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(4, new java.io.StringReader(dm.oldaddr2_cnfm), dm.oldaddr2_cnfm.length());
			}
			else{
				cstmt.setString(10, dm.oldaddr2_cnfm);
			}
			
			temp = "oldaddr3_cnfm";
			if(dm.oldaddr3_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(4, new java.io.StringReader(dm.oldaddr3_cnfm), dm.oldaddr3_cnfm.length());
			}
			else{
				cstmt.setString(11, dm.oldaddr3_cnfm);
			}
			
			temp = "oldaddr4_cnfm";
			if(dm.oldaddr4_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(4, new java.io.StringReader(dm.oldaddr4_cnfm), dm.oldaddr4_cnfm.length());
			}
			else{
				cstmt.setString(12, dm.oldaddr4_cnfm);
			}
			
			temp = "oldbgnbnji_cnfm";
			if(dm.oldbgnbnji_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(4, new java.io.StringReader(dm.oldbgnbnji_cnfm), dm.oldbgnbnji_cnfm.length());
			}
			else{
				cstmt.setString(13, dm.oldbgnbnji_cnfm);
			}
			
			temp = "oldendbnji_cnfm";
			if(dm.oldendbnji_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(4, new java.io.StringReader(dm.oldendbnji_cnfm), dm.oldendbnji_cnfm.length());
			}
			else{
				cstmt.setString(14, dm.oldendbnji_cnfm);
			}
			
			temp = "newzip1_cnfm";
			if(dm.newzip1_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(4, new java.io.StringReader(dm.newzip1_cnfm), dm.newzip1_cnfm.length());
			}
			else{
				cstmt.setString(15, dm.newzip1_cnfm);
			}
			
			temp = "newzip2_cnfm";
			if(dm.newzip2_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(4, new java.io.StringReader(dm.newzip2_cnfm), dm.newzip2_cnfm.length());
			}
			else{
				cstmt.setString(16, dm.newzip2_cnfm);
			}
			
			temp = "newzip3_cnfm";
			if(dm.newzip3_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(4, new java.io.StringReader(dm.newzip3_cnfm), dm.newzip3_cnfm.length());
			}
			else{
				cstmt.setString(17, dm.newzip3_cnfm);
			}
			
			temp = "newzip4_cnfm";
			if(dm.newzip4_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(4, new java.io.StringReader(dm.newzip4_cnfm), dm.newzip4_cnfm.length());
			}
			else{
				cstmt.setString(18, dm.newzip4_cnfm);
			}
			
			temp = "newaddr1_cnfm";
			if(dm.newaddr1_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(4, new java.io.StringReader(dm.newaddr1_cnfm), dm.newaddr1_cnfm.length());
			}
			else{
				cstmt.setString(19, dm.newaddr1_cnfm);
			}
			
			temp = "newaddr2_cnfm";
			if(dm.newaddr2_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(4, new java.io.StringReader(dm.newaddr2_cnfm), dm.newaddr2_cnfm.length());
			}
			else{
				cstmt.setString(20, dm.newaddr2_cnfm);
			}
			
			temp = "newaddr3_cnfm";
			if(dm.newaddr3_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(4, new java.io.StringReader(dm.newaddr3_cnfm), dm.newaddr3_cnfm.length());
			}
			else{
				cstmt.setString(21, dm.newaddr3_cnfm);
			}
			
			temp = "newaddr4_cnfm";
			if(dm.newaddr4_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(4, new java.io.StringReader(dm.newaddr4_cnfm), dm.newaddr4_cnfm.length());
			}
			else{
				cstmt.setString(22, dm.newaddr4_cnfm);
			}
			
			temp = "newbgnbnji_cnfm";
			if(dm.newbgnbnji_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(4, new java.io.StringReader(dm.newbgnbnji_cnfm), dm.newbgnbnji_cnfm.length());
			}
			else{
				cstmt.setString(23, dm.newbgnbnji_cnfm);
			}
			
			temp = "newendbnji_cnfm";
			if(dm.newendbnji_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(4, new java.io.StringReader(dm.newendbnji_cnfm), dm.newendbnji_cnfm.length());
			}
			else{
				cstmt.setString(24, dm.newendbnji_cnfm);
			}
			
			temp = "chgresn_cnfm";
			if(dm.chgresn_cnfm.getBytes().length > 4000){
				cstmt.setCharacterStream(4, new java.io.StringReader(dm.chgresn_cnfm), dm.chgresn_cnfm.length());
			}
			else{
				cstmt.setString(25, dm.chgresn_cnfm);
			}
			
		}
		catch(SQLException e){
			System.out.println(temp + ":" + e);                                                                                                                                                                                                                                                                                                                                                                                                   
     		throw e; 
		}
		}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_L_UPLOADZIPCODEDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String gubun_cnfm = req.getParameter("gubun_cnfm");
if( gubun_cnfm == null){
	System.out.println(this.toString+" : gubun_cnfm is null" );
}else{
	System.out.println(this.toString+" : gubun_cnfm is "+gubun_cnfm );
}
String oldzip1_cnfm = req.getParameter("oldzip1_cnfm");
if( oldzip1_cnfm == null){
	System.out.println(this.toString+" : oldzip1_cnfm is null" );
}else{
	System.out.println(this.toString+" : oldzip1_cnfm is "+oldzip1_cnfm );
}
String oldzip2_cnfm = req.getParameter("oldzip2_cnfm");
if( oldzip2_cnfm == null){
	System.out.println(this.toString+" : oldzip2_cnfm is null" );
}else{
	System.out.println(this.toString+" : oldzip2_cnfm is "+oldzip2_cnfm );
}
String oldzip3_cnfm = req.getParameter("oldzip3_cnfm");
if( oldzip3_cnfm == null){
	System.out.println(this.toString+" : oldzip3_cnfm is null" );
}else{
	System.out.println(this.toString+" : oldzip3_cnfm is "+oldzip3_cnfm );
}
String oldzip4_cnfm = req.getParameter("oldzip4_cnfm");
if( oldzip4_cnfm == null){
	System.out.println(this.toString+" : oldzip4_cnfm is null" );
}else{
	System.out.println(this.toString+" : oldzip4_cnfm is "+oldzip4_cnfm );
}
String oldaddr1_cnfm = req.getParameter("oldaddr1_cnfm");
if( oldaddr1_cnfm == null){
	System.out.println(this.toString+" : oldaddr1_cnfm is null" );
}else{
	System.out.println(this.toString+" : oldaddr1_cnfm is "+oldaddr1_cnfm );
}
String oldaddr2_cnfm = req.getParameter("oldaddr2_cnfm");
if( oldaddr2_cnfm == null){
	System.out.println(this.toString+" : oldaddr2_cnfm is null" );
}else{
	System.out.println(this.toString+" : oldaddr2_cnfm is "+oldaddr2_cnfm );
}
String oldaddr3_cnfm = req.getParameter("oldaddr3_cnfm");
if( oldaddr3_cnfm == null){
	System.out.println(this.toString+" : oldaddr3_cnfm is null" );
}else{
	System.out.println(this.toString+" : oldaddr3_cnfm is "+oldaddr3_cnfm );
}
String oldaddr4_cnfm = req.getParameter("oldaddr4_cnfm");
if( oldaddr4_cnfm == null){
	System.out.println(this.toString+" : oldaddr4_cnfm is null" );
}else{
	System.out.println(this.toString+" : oldaddr4_cnfm is "+oldaddr4_cnfm );
}
String oldbgnbnji_cnfm = req.getParameter("oldbgnbnji_cnfm");
if( oldbgnbnji_cnfm == null){
	System.out.println(this.toString+" : oldbgnbnji_cnfm is null" );
}else{
	System.out.println(this.toString+" : oldbgnbnji_cnfm is "+oldbgnbnji_cnfm );
}
String oldendbnji_cnfm = req.getParameter("oldendbnji_cnfm");
if( oldendbnji_cnfm == null){
	System.out.println(this.toString+" : oldendbnji_cnfm is null" );
}else{
	System.out.println(this.toString+" : oldendbnji_cnfm is "+oldendbnji_cnfm );
}
String newzip1_cnfm = req.getParameter("newzip1_cnfm");
if( newzip1_cnfm == null){
	System.out.println(this.toString+" : newzip1_cnfm is null" );
}else{
	System.out.println(this.toString+" : newzip1_cnfm is "+newzip1_cnfm );
}
String newzip2_cnfm = req.getParameter("newzip2_cnfm");
if( newzip2_cnfm == null){
	System.out.println(this.toString+" : newzip2_cnfm is null" );
}else{
	System.out.println(this.toString+" : newzip2_cnfm is "+newzip2_cnfm );
}
String newzip3_cnfm = req.getParameter("newzip3_cnfm");
if( newzip3_cnfm == null){
	System.out.println(this.toString+" : newzip3_cnfm is null" );
}else{
	System.out.println(this.toString+" : newzip3_cnfm is "+newzip3_cnfm );
}
String newzip4_cnfm = req.getParameter("newzip4_cnfm");
if( newzip4_cnfm == null){
	System.out.println(this.toString+" : newzip4_cnfm is null" );
}else{
	System.out.println(this.toString+" : newzip4_cnfm is "+newzip4_cnfm );
}
String newaddr1_cnfm = req.getParameter("newaddr1_cnfm");
if( newaddr1_cnfm == null){
	System.out.println(this.toString+" : newaddr1_cnfm is null" );
}else{
	System.out.println(this.toString+" : newaddr1_cnfm is "+newaddr1_cnfm );
}
String newaddr2_cnfm = req.getParameter("newaddr2_cnfm");
if( newaddr2_cnfm == null){
	System.out.println(this.toString+" : newaddr2_cnfm is null" );
}else{
	System.out.println(this.toString+" : newaddr2_cnfm is "+newaddr2_cnfm );
}
String newaddr3_cnfm = req.getParameter("newaddr3_cnfm");
if( newaddr3_cnfm == null){
	System.out.println(this.toString+" : newaddr3_cnfm is null" );
}else{
	System.out.println(this.toString+" : newaddr3_cnfm is "+newaddr3_cnfm );
}
String newaddr4_cnfm = req.getParameter("newaddr4_cnfm");
if( newaddr4_cnfm == null){
	System.out.println(this.toString+" : newaddr4_cnfm is null" );
}else{
	System.out.println(this.toString+" : newaddr4_cnfm is "+newaddr4_cnfm );
}
String newbgnbnji_cnfm = req.getParameter("newbgnbnji_cnfm");
if( newbgnbnji_cnfm == null){
	System.out.println(this.toString+" : newbgnbnji_cnfm is null" );
}else{
	System.out.println(this.toString+" : newbgnbnji_cnfm is "+newbgnbnji_cnfm );
}
String newendbnji_cnfm = req.getParameter("newendbnji_cnfm");
if( newendbnji_cnfm == null){
	System.out.println(this.toString+" : newendbnji_cnfm is null" );
}else{
	System.out.println(this.toString+" : newendbnji_cnfm is "+newendbnji_cnfm );
}
String chgresn_cnfm = req.getParameter("chgresn_cnfm");
if( chgresn_cnfm == null){
	System.out.println(this.toString+" : chgresn_cnfm is null" );
}else{
	System.out.println(this.toString+" : chgresn_cnfm is "+chgresn_cnfm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String uid = Util.checkString(req.getParameter("uid"));
String gubun_cnfm = Util.checkString(req.getParameter("gubun_cnfm"));
String oldzip1_cnfm = Util.checkString(req.getParameter("oldzip1_cnfm"));
String oldzip2_cnfm = Util.checkString(req.getParameter("oldzip2_cnfm"));
String oldzip3_cnfm = Util.checkString(req.getParameter("oldzip3_cnfm"));
String oldzip4_cnfm = Util.checkString(req.getParameter("oldzip4_cnfm"));
String oldaddr1_cnfm = Util.checkString(req.getParameter("oldaddr1_cnfm"));
String oldaddr2_cnfm = Util.checkString(req.getParameter("oldaddr2_cnfm"));
String oldaddr3_cnfm = Util.checkString(req.getParameter("oldaddr3_cnfm"));
String oldaddr4_cnfm = Util.checkString(req.getParameter("oldaddr4_cnfm"));
String oldbgnbnji_cnfm = Util.checkString(req.getParameter("oldbgnbnji_cnfm"));
String oldendbnji_cnfm = Util.checkString(req.getParameter("oldendbnji_cnfm"));
String newzip1_cnfm = Util.checkString(req.getParameter("newzip1_cnfm"));
String newzip2_cnfm = Util.checkString(req.getParameter("newzip2_cnfm"));
String newzip3_cnfm = Util.checkString(req.getParameter("newzip3_cnfm"));
String newzip4_cnfm = Util.checkString(req.getParameter("newzip4_cnfm"));
String newaddr1_cnfm = Util.checkString(req.getParameter("newaddr1_cnfm"));
String newaddr2_cnfm = Util.checkString(req.getParameter("newaddr2_cnfm"));
String newaddr3_cnfm = Util.checkString(req.getParameter("newaddr3_cnfm"));
String newaddr4_cnfm = Util.checkString(req.getParameter("newaddr4_cnfm"));
String newbgnbnji_cnfm = Util.checkString(req.getParameter("newbgnbnji_cnfm"));
String newendbnji_cnfm = Util.checkString(req.getParameter("newendbnji_cnfm"));
String chgresn_cnfm = Util.checkString(req.getParameter("chgresn_cnfm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String gubun_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun_cnfm")));
String oldzip1_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("oldzip1_cnfm")));
String oldzip2_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("oldzip2_cnfm")));
String oldzip3_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("oldzip3_cnfm")));
String oldzip4_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("oldzip4_cnfm")));
String oldaddr1_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("oldaddr1_cnfm")));
String oldaddr2_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("oldaddr2_cnfm")));
String oldaddr3_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("oldaddr3_cnfm")));
String oldaddr4_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("oldaddr4_cnfm")));
String oldbgnbnji_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("oldbgnbnji_cnfm")));
String oldendbnji_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("oldendbnji_cnfm")));
String newzip1_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("newzip1_cnfm")));
String newzip2_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("newzip2_cnfm")));
String newzip3_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("newzip3_cnfm")));
String newzip4_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("newzip4_cnfm")));
String newaddr1_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("newaddr1_cnfm")));
String newaddr2_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("newaddr2_cnfm")));
String newaddr3_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("newaddr3_cnfm")));
String newaddr4_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("newaddr4_cnfm")));
String newbgnbnji_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("newbgnbnji_cnfm")));
String newendbnji_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("newendbnji_cnfm")));
String chgresn_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("chgresn_cnfm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setGubun_cnfm(gubun_cnfm);
dm.setOldzip1_cnfm(oldzip1_cnfm);
dm.setOldzip2_cnfm(oldzip2_cnfm);
dm.setOldzip3_cnfm(oldzip3_cnfm);
dm.setOldzip4_cnfm(oldzip4_cnfm);
dm.setOldaddr1_cnfm(oldaddr1_cnfm);
dm.setOldaddr2_cnfm(oldaddr2_cnfm);
dm.setOldaddr3_cnfm(oldaddr3_cnfm);
dm.setOldaddr4_cnfm(oldaddr4_cnfm);
dm.setOldbgnbnji_cnfm(oldbgnbnji_cnfm);
dm.setOldendbnji_cnfm(oldendbnji_cnfm);
dm.setNewzip1_cnfm(newzip1_cnfm);
dm.setNewzip2_cnfm(newzip2_cnfm);
dm.setNewzip3_cnfm(newzip3_cnfm);
dm.setNewzip4_cnfm(newzip4_cnfm);
dm.setNewaddr1_cnfm(newaddr1_cnfm);
dm.setNewaddr2_cnfm(newaddr2_cnfm);
dm.setNewaddr3_cnfm(newaddr3_cnfm);
dm.setNewaddr4_cnfm(newaddr4_cnfm);
dm.setNewbgnbnji_cnfm(newbgnbnji_cnfm);
dm.setNewendbnji_cnfm(newendbnji_cnfm);
dm.setChgresn_cnfm(chgresn_cnfm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 17 17:43:17 KST 2010 */