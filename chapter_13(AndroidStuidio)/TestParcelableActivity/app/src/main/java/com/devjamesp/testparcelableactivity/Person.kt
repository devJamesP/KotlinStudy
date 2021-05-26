package com.devjamesp.testparcelableactivity

import android.os.Parcel
import android.os.Parcelable
import androidx.versionedparcelable.ParcelField

/*
describeContents( ) 메서드는 Parcel의 내용을 기술하는데 보통은 0을 반환합니다.
writeToParcel( ) 메서드는 매개변수 Parcel 안에 데이터를 넣는 작업을 합니다. 이때 몇 가지 플래그(flag)를 설정 가능
Creator 객체(컴페니언 객체)를 통해 안드로이드 app 내부에서 서로의 id를 확인한 후 통신할 수 있기 때문에 Parcelable.Creator<T>로
선언되어 나중에 Parcel로 목적지에서 풀어 낼 때 필요합니다.

createFromParcel( ) 메서드는 Parcel된 데이터를 다시 원래대로 만들어 주는 작업을 하고
newArray( ) 메서드는Parcel.createTypeArray( )을 호출했을 때 불립니다.

 */
data class Person(val name: String, val age: Int): Parcelable {
    /* 부 생성자에서 Parcel객체를 수신하면 주 생성자를 호출하여
 각각 Parcel객체에 담겨있는 데이터로 프로퍼티를 초기화 해준다. */
    private constructor(p: Parcel) : this(
            name = p.readString() ?: "null",
            age = p.readInt()
    )

    /* Parcel 객체를 생성(name, age 프로퍼티를 dest Parcel객체에 박싱)*/
    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(name)
        dest?.writeInt(age)
    }

    override fun describeContents(): Int = 0

    companion object {
        // 안드로이드 애플리케이션 내부에서 서로의 id를 확인한 후 통신
        @JvmField val CREATOR = object: Parcelable.Creator<Person> {
            override fun createFromParcel(source: Parcel): Person = Person(source)

            override fun newArray(size: Int): Array<Person?> = arrayOfNulls<Person>(size)
        }
    }
}