import os
import json

BASE_FOLDER = os.path.dirname(os.path.abspath(__file__))

def should_ignore(name: str) -> bool:
    return name.startswith("dark_") or name.startswith("golden_")

for filename in os.listdir(BASE_FOLDER):
    if not filename.endswith(".json"):
        continue

    item_name = filename[:-5]  # remove .json

    if should_ignore(item_name):
        print(f"⏭ Skipping: {filename}")
        continue

    output_name = f"dark_{item_name}.json"
    output_path = os.path.join(BASE_FOLDER, output_name)

    recipe = {
        "type": "overgeared:forging",
        "category": "armors",
        "hammering": 4,
        "has_polishing": False,
        "has_quality": True,
        "minimum_quality": "poor",
        "need_quenching": False,
        "pattern": [
            "xix",
            "abi"
        ],
        "key": {
            "x": {
                "item": "minecraft:basalt"
            },
            "i": {
                "item": "minecraft:bone_meal"
            },
            "a": {
                "item": "minecraft:copper_ingot"
            },
            "b": {
                "item": f"knightsheraldry:{item_name}"
            }
        },
        "result": {
            "item": f"knightsheraldry:dark_{item_name}",
            "count": 1
        },
        "show_notification": True
    }

    with open(output_path, "w", encoding="utf-8") as f:
        json.dump(recipe, f, indent=2)

    print(f"✅ Generated: {output_name}")

print("\n🎉 All golden recipes generated!")
