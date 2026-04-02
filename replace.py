import os

def replace_in_json_files(folder_path):
    for filename in os.listdir(folder_path):
        if filename.endswith(".json"):
            file_path = os.path.join(folder_path, filename)

            with open(file_path, "r", encoding="utf-8") as file:
                content = file.read()

            # Replace all occurrences
            new_content = content.replace("minecraft:crafting_shapeless", "overgeared:crafting_shapeless")

            # Only write if something changed
            if content != new_content:
                with open(file_path, "w", encoding="utf-8") as file:
                    file.write(new_content)
                print(f"Updated: {filename}")
            else:
                print(f"No change: {filename}")

if __name__ == "__main__":
    current_folder = os.path.dirname(os.path.abspath(__file__))
    replace_in_json_files(current_folder)