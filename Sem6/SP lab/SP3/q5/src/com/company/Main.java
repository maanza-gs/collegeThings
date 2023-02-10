package com.company;

import java.util.*;
import java.lang.*;


class Unit
{
    public int Health;
    public int Damage;
    public int Armor;
}

class Soldier extends Unit
        {
            public Soldier()
                    {
                    Health = 100;
                    Damage = 20;
                    Armor = 10;
                    }
        }

class Tank extends Unit
        {
            public Tank()
                    {
                    Health = 200;
                    Damage = 50;
                    Armor = 30;
                    }
        }

class UnitFactory
{
    private Dictionary<String, Unit> _unitDictionary = new Dictionary<String, Unit>();
    public static int NumberOfInstances = 0;

    public Unit GetUnit(String unitType)
    {
        Unit unit;
        if (_unitDictionary.TryGetValue(unitType, out unit))
        {
            NumberOfInstances++;
            return unit;
        }
        else
        {
            switch (unitType)
            {
                case "Soldier":
                    unit = new Soldier();
                    break;
                case "Tank":
                    unit = new Tank();
                    break;
                default:
                    throw new Exception("Invalid unit type");
            }
            _unitDictionary.add(unitType, unit);
            NumberOfInstances++;
            return unit;
        }
    }
}

class WarGame
{
    static void Main()
    {
        UnitFactory factory = new UnitFactory();
        Unit soldier1 = factory.GetUnit("Soldier");
        Unit soldier2 = factory.GetUnit("Soldier");
        Unit tank1 = factory.GetUnit("Tank");
        Unit tank2 = factory.GetUnit("Tank");
        System.out.println("Number of instances: " + UnitFactory.NumberOfInstances);
        Console.ReadKey();
    }
}
