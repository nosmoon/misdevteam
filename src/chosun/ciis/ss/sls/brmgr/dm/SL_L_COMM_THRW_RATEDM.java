/***************************************************************************************************
 * ���ϸ�   : SP_SL_L_COMM_THRW_RATE.java
 * ���     : ����������
 * �ۼ����� : 2006/03/08
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
**  ����������-��Ȳ���
**/

public class SL_L_COMM_THRW_RATEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String hoscnt;
	public String housval;

	public SL_L_COMM_THRW_RATEDM(){}
	public SL_L_COMM_THRW_RATEDM(String hoscnt, String housval){
		this.hoscnt = hoscnt;
		this.housval = housval;
	}

	public void setHoscnt(String hoscnt){
		this.hoscnt = hoscnt;
	}

	public void setHousval(String housval){
		this.housval = housval;
	}

	public String getHoscnt(){
		return this.hoscnt;
	}

	public String getHousval(){
		return this.housval;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_COMM_THRW_RATE( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_COMM_THRW_RATEDM dm = (SL_L_COMM_THRW_RATEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.hoscnt);
		cstmt.setString(4, dm.housval);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SL_L_COMM_THRW_RATEDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String hoscnt = req.getParameter("hoscnt");
if( hoscnt == null){
	System.out.println(this.toString+" : hoscnt is null" );
}else{
	System.out.println(this.toString+" : hoscnt is "+hoscnt );
}
String housval = req.getParameter("housval");
if( housval == null){
	System.out.println(this.toString+" : housval is null" );
}else{
	System.out.println(this.toString+" : housval is "+housval );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String hoscnt = Util.checkString(req.getParameter("hoscnt"));
String housval = Util.checkString(req.getParameter("housval"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String hoscnt = Util.Uni2Ksc(Util.checkString(req.getParameter("hoscnt")));
String housval = Util.Uni2Ksc(Util.checkString(req.getParameter("housval")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setHoscnt(hoscnt);
dm.setHousval(housval);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Mar 11 13:15:24 KST 2006 */