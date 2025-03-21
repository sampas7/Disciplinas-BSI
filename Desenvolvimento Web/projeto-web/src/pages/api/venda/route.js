import { createConnection } from "../../lib/mysql";
import { NextResponse } from "next/server";

export async function GET(){
  try{
    const db = await createConnection()
    const sql = "select * from venda"
    const [vendas] = await db.query(sql)
    return NextResponse.json({vendas: vendas})

  }catch(error){
    console.log(error)
    return NextResponse.json({ error: error.message })

  }

}