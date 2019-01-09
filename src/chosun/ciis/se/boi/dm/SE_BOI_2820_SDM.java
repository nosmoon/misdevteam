/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
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


public class SE_BOI_2820_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bo_cd;
	public String bo_seq;

	public SE_BOI_2820_SDM(){}
	public SE_BOI_2820_SDM(String bo_cd, String bo_seq){
		this.bo_cd = bo_cd;
		this.bo_seq = bo_seq;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BOI_2820_S(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_2820_SDM dm = (SE_BOI_2820_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bo_cd);
		cstmt.setString(4, dm.bo_seq);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_2820_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("bo_cd = [" + getBo_cd() + "]");
		System.out.println("bo_seq = [" + getBo_seq() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String bo_seq = req.getParameter("bo_seq");
if( bo_seq == null){
	System.out.println(this.toString+" : bo_seq is null" );
}else{
	System.out.println(this.toString+" : bo_seq is "+bo_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String bo_seq = Util.checkString(req.getParameter("bo_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String bo_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBo_cd(bo_cd);
dm.setBo_seq(bo_seq);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Nov 02 10:29:39 KST 2016 */