/***************************************************************************************************
* ���ϸ� : 
* ��� : 
* �ۼ����� : 2017-01-05
* �ۼ��� : �� �� ȫ
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


public class SE_BOI_3030_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String seq;
	public String incmg_pers;
	public String rmk;

	public SE_BOI_3030_UDM(){}
	public SE_BOI_3030_UDM(String seq, String incmg_pers, String rmk){
		this.seq = seq;
		this.incmg_pers = incmg_pers;
		this.rmk = rmk;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setRmk(String rmk){
		this.rmk = rmk;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getRmk(){
		return this.rmk;
	}

	public String getSQL(){
		 return "{ call SP_SE_BOI_3030_U( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_3030_UDM dm = (SE_BOI_3030_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.seq);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.rmk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_3030_UDataSet();
	}



    public void print(){
        System.out.println("seq = " + getSeq());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("rmk = " + getRmk());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String rmk = req.getParameter("rmk");
if( rmk == null){
	System.out.println(this.toString+" : rmk is null" );
}else{
	System.out.println(this.toString+" : rmk is "+rmk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String seq = Util.checkString(req.getParameter("seq"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String rmk = Util.checkString(req.getParameter("rmk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String rmk = Util.Uni2Ksc(Util.checkString(req.getParameter("rmk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setSeq(seq);
dm.setIncmg_pers(incmg_pers);
dm.setRmk(rmk);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jul 03 13:47:47 KST 2017 */