/***************************************************************************************************
* 파일명 : .java
* 기능 : 거래처인물정보
* 작성일자 : 2010.07.14
* 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.common.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.common.rec.AD_CO_1510_LCURLISTRecord;


public class AD_CO_1510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable
{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_CO_1510_LDataSet(){}
	public AD_CO_1510_LDataSet(String errcode, String errmsg)
	{
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode)
	{
		this.errcode = errcode;
	}
	public void setErrmsg(String errmsg)
	{
		this.errmsg = errmsg;
	}

	public String getErrcode()
	{
		return this.errcode;
	}
	public String getErrmsg()
	{
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException
	{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode))
		{
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next())
		{
			AD_CO_1510_LCURLISTRecord rec = new AD_CO_1510_LCURLISTRecord();
			rec.dlco_no 		= Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm 		= Util.checkString(rset0.getString("dlco_nm"));
			rec.cust_seq 		= Util.checkString(rset0.getString("cust_seq"));
			rec.cust_name 		= Util.checkString(rset0.getString("cust_name"));
			rec.department 		= Util.checkString(rset0.getString("department"));
			rec.position 		= Util.checkString(rset0.getString("position"));
			rec.mobile1 		= Util.checkString(rset0.getString("mobile1"));
			rec.address 		= Util.checkString(rset0.getString("address"));
			rec.chg_dt_tm 		= Util.checkString(rset0.getString("chg_dt_tm"));
			rec.incumbent_yn 	= Util.checkString(rset0.getString("incumbent_yn"));
			this.curlist.add(rec);
		}
	}
}